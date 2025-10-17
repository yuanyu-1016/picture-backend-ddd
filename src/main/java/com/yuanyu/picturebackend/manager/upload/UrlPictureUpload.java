package com.yuanyu.picturebackend.manager.upload;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.yuanyu.picture.infrastructure.exception.ErrorCode;
import com.yuanyu.picture.infrastructure.exception.ThrowUtils;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class UrlPictureUpload extends PictureUploadTemplate {  
    @Override  
    protected void validPicture(Object inputSource) {  
        String fileUrl = (String) inputSource;  
        ThrowUtils.throwIf(StrUtil.isBlank(fileUrl), ErrorCode.PARAMS_ERROR, "文件地址不能为空");
        // ... 跟之前的校验逻辑保持一致  
    }  
  
//    @Override
//    protected String getOriginFilename(Object inputSource) {
//        String fileUrl = (String) inputSource;
//        // 从 URL 中提取文件名
//        return FileUtil.mainName(fileUrl);
//    }

    @Override
    protected String getOriginFilename(Object inputSource) {
        String fileUrl = (String) inputSource;
        // 找到 '?' 的位置
        int queryParamIndex = fileUrl.indexOf('?');
        if (queryParamIndex != -1) {
            // 截取 '?' 之前的部分
            fileUrl = fileUrl.substring(0, queryParamIndex);
        }
        // 从清理后的 URL 中提取文件名
        String originFilename = FileUtil.getName(fileUrl);
        // 清理文件名中的非法字符（如果需要）
        // originFilename = originFilename.replaceAll("[<>:\"/\\\\|?*]", "");
        return originFilename;
    }
  
    @Override  
    protected void processFile(Object inputSource, File file) throws Exception {
        String fileUrl = (String) inputSource;  
        // 下载文件到临时目录  
        HttpUtil.downloadFile(fileUrl, file);
    }  
}

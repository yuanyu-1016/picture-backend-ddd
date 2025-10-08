package com.yuanyu.picturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanyu.picturebackend.model.dto.spaceuser.SpaceUserAddRequest;
import com.yuanyu.picturebackend.model.dto.spaceuser.SpaceUserQueryRequest;
import com.yuanyu.picturebackend.model.entity.SpaceUser;
import com.yuanyu.picturebackend.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 空间用户 服务类
 * </p>
 *
 * @author yuanyu
 * @since 2025-09-17
 */
public interface SpaceUserService extends IService<SpaceUser> {

    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);


    void validSpaceUser(SpaceUser spaceUser, boolean add);

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}

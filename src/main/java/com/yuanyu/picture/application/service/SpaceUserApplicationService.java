package com.yuanyu.picture.application.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanyu.picture.interfaces.dto.spaceuser.SpaceUserAddRequest;
import com.yuanyu.picture.interfaces.dto.spaceuser.SpaceUserQueryRequest;
import com.yuanyu.picture.domain.space.entity.SpaceUser;
import com.yuanyu.picture.interfaces.vo.space.SpaceUserVO;

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
public interface SpaceUserApplicationService extends IService<SpaceUser> {

    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);


    void validSpaceUser(SpaceUser spaceUser, boolean add);

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}

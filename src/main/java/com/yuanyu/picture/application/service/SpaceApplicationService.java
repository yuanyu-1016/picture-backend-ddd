package com.yuanyu.picture.application.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuanyu.picture.interfaces.dto.space.SpaceAddRequest;
import com.yuanyu.picture.interfaces.dto.space.SpaceQueryRequest;
import com.yuanyu.picture.domain.space.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanyu.picture.domain.user.entity.User;
import com.yuanyu.picture.interfaces.vo.space.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 空间 服务类
 * </p>
 *
 * @author yuanyu
 * @since 2025-09-25
 */
public interface SpaceApplicationService extends IService<Space> {

    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    void fillSpaceBySpaceLevel(Space space);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    void checkSpaceAuth(User loginUser, Space space);
}

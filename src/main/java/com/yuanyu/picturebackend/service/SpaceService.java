package com.yuanyu.picturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuanyu.picturebackend.model.dto.space.SpaceAddRequest;
import com.yuanyu.picturebackend.model.dto.space.SpaceQueryRequest;
import com.yuanyu.picturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanyu.picturebackend.model.entity.User;
import com.yuanyu.picturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 空间 服务类
 * </p>
 *
 * @author yuanyu
 * @since 2025-09-25
 */
public interface SpaceService extends IService<Space> {

    void validSpace(Space space, boolean add);

    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    void fillSpaceBySpaceLevel(Space space);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    void checkSpaceAuth(User loginUser, Space space);
}

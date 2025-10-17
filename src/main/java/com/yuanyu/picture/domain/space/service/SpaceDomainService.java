package com.yuanyu.picture.domain.space.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuanyu.picture.domain.space.entity.Space;
import com.yuanyu.picture.domain.user.entity.User;
import com.yuanyu.picture.interfaces.dto.space.SpaceQueryRequest;

/**
 * <p>
 * 空间 服务类
 * </p>
 *
 * @author yuanyu
 * @since 2025-09-25
 */
public interface SpaceDomainService {

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    void fillSpaceBySpaceLevel(Space space);

    void checkSpaceAuth(User loginUser, Space space);
}

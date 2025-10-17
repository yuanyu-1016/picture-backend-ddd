package com.yuanyu.picture.domain.space.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuanyu.picture.domain.space.entity.SpaceUser;
import com.yuanyu.picture.interfaces.dto.spaceuser.SpaceUserQueryRequest;

/**
 * <p>
 * 空间用户 服务类
 * </p>
 *
 * @author yuanyu
 * @since 2025-09-17
 */
public interface SpaceUserDomainService {

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);
}

package com.yuanyu.picture.domain.space.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanyu.picture.domain.space.entity.SpaceUser;
import com.yuanyu.picture.infrastructure.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceUserRepositoryImpl extends ServiceImpl<SpaceUserMapper, SpaceUser> implements SpaceUserRepository {
}

package com.yuanyu.picture.domain.space.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanyu.picture.domain.space.entity.Space;
import com.yuanyu.picture.infrastructure.mapper.SpaceMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceRepositoryImpl extends ServiceImpl<SpaceMapper, Space> implements SpaceRepository {
}

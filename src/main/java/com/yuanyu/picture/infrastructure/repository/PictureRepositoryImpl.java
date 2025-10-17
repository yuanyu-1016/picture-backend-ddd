package com.yuanyu.picture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanyu.picture.domain.picture.entity.Picture;
import com.yuanyu.picture.domain.picture.repository.PictureRepository;
import com.yuanyu.picture.infrastructure.mapper.PictureMapper;
import org.springframework.stereotype.Service;

@Service
public class PictureRepositoryImpl extends ServiceImpl<PictureMapper, Picture> implements PictureRepository {
}

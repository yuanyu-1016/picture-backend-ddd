package com.yuanyu.picture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanyu.picture.domain.user.entity.User;
import com.yuanyu.picture.domain.user.repository.UserRepository;
import com.yuanyu.picture.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository {
}

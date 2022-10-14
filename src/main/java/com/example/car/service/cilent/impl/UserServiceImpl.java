package com.example.car.service.cilent.impl;

import com.example.car.mapper.UserMapper;
import com.example.car.model.User;
import com.example.car.service.cilent.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @author menxipeng by 2022/10/14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        return userMapper.insert(user);
    }
}

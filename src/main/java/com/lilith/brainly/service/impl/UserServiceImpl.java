package com.lilith.brainly.service.impl;

import com.lilith.brainly.dao.UserMapper;
import com.lilith.brainly.entity.User;
import com.lilith.brainly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:JiaJingnan
 * @Date: 下午10:37 2021/6/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public User findUserByName(String username) {
        return userMapper.selectByName(username);
    }

    @Override
    public User findUserByEmail(String email) {
        return userMapper.selectByEmail(email);
    }
}

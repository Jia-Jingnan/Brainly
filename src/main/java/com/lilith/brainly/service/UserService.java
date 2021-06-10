package com.lilith.brainly.service;

import com.lilith.brainly.entity.User;

/**
 * @Author:JiaJingnan
 * @Date: 下午10:37 2021/6/10
 */
public interface UserService {

    User findUserById(int id);

    User findUserByName(String username);

    User findUserByEmail(String email);

}

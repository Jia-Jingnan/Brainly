package com.lilith.brainly.dao;

import com.lilith.brainly.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:JiaJingnan
 * @Date: 下午10:34 2021/6/10
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}

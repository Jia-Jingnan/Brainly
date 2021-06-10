package com.lilith.brainly.dao;

import com.lilith.brainly.BrainlyApplicationTests;
import com.lilith.brainly.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Author:JiaJingnan
 * @Date: 下午10:42 2021/6/10
 */
public class UserMapperTest extends BrainlyApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById() {

        User user = userMapper.selectById(11);
        System.out.println(user);
        Assert.assertEquals("lilith11",user.getUsername());

    }

    @Test
    public void selectByName() {
        User lilith11 = userMapper.selectByName("lilith11");
        Assert.assertEquals(11,lilith11.getId());
    }

    @Test
    public void selectByEmail() {
        User user = userMapper.selectByEmail("lilith11@brainly.com");
        Assert.assertEquals(11, user.getId());
    }

    @Test
    public void insertUser() {

        User user = new User();
        user.setUsername("lilith");
        user.setEmail("lilith@brainly.com");
        user.setPassword("123456");
        user.setCreateTime(new Date());

        int count = userMapper.insertUser(user);
        Assert.assertEquals(1, count);
    }

    @Test
    public void updateStatus() {
        int count = userMapper.updateStatus(11, 1);
        Assert.assertEquals(1,count);
    }

    @Test
    public void updateHeader() {
        int count = userMapper.updateHeader(11, "https://github.com/identicons/1.png");
        Assert.assertEquals(1,count);
    }

    @Test
    public void updatePassword() {
        int i = userMapper.updatePassword(11, "12345");
        Assert.assertEquals(1,i);
    }
}
package com.lilith.brainly.dao;

import com.lilith.brainly.BrainlyApplicationTests;
import com.lilith.brainly.entity.DiscussPost;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author:JiaJingnan
 * @Date: 下午11:07 2021/6/10
 */
public class DiscussPostMapperTest extends BrainlyApplicationTests {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void selectDiscussPosts() {

        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(3, 1, 10);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);
        }
        Assert.assertEquals(10,discussPosts.size());
    }

    @Test
    public void selectDiscussPostRows() {

        int count = discussPostMapper.selectDiscussPostRows(3);
        System.out.println(count);
        Assert.assertEquals(19,count);
    }
}
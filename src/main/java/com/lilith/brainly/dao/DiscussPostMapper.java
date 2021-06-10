package com.lilith.brainly.dao;

import com.lilith.brainly.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午9:38 2021/6/9
 */
@Mapper
public interface DiscussPostMapper {


    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 使用动态拼接参数，有且只有一个参数要使用@param注解
    int selectDiscussPostRows(@Param("userId") int userId);


}

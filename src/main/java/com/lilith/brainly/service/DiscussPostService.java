package com.lilith.brainly.service;

import com.lilith.brainly.entity.DiscussPost;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 下午11:15 2021/6/10
 */
public interface DiscussPostService {

    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);

    int findDiscussPostRows(int userId);
}

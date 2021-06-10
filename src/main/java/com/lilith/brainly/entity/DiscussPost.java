package com.lilith.brainly.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author:JiaJingnan
 * @Date: 下午11:02 2021/6/10
 */
@Data
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int comment;
    private double score;
}

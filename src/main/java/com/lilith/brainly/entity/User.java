package com.lilith.brainly.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author:JiaJingnan
 * @Date: 下午10:30 2021/6/10
 */
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}

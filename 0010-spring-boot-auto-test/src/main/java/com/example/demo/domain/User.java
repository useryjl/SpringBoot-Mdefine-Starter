package com.example.demo.domain;

import lombok.Data;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
@Data
public class User {
    private Integer id;
    private String userPwd;
    private String userName;
    private Integer gender;
    private String email;
    private Integer roomId;
    private Integer userType;
}

package com.example.demo.util;

import java.util.UUID;

/**
 * @author yjl
 * @Description
 * @create 2021-12-11
 */
public class LoginUtil {
    //密码加密
    public static String getMd5_Password(String password){
        String substring = password.substring(1, 3);
        String string = UUID.randomUUID().toString();
        String replace = string.replace("-", "");
        String s = replace + substring;
        return s;
    }
}

package com.yjl.system.exception;

import com.yjl.system.UseAnnotation;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.setName("yjl");
        user.setAge(-1);
        System.out.println(user);
    }
}

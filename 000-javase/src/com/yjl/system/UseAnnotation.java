package com.yjl.system;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class UseAnnotation {

    private String hello;

    @MyAnnotation(value = "test1方法上的注解")
    public void test1() {
        System.out.println("test1");
    }


    public void test2() {
        System.out.println("test2");
    }


    public String test3() {
        return "hello";
    }
}

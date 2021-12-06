package com.yjl.system.exception;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age<0){
            throw new MyDefineEexception("年龄为负数异常");
        }
    }
}

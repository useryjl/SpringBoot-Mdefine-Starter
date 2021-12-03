package com.yjl.domain;

/**
 * @author yjl
 * @Description
 * @create 2021-12-03
 */
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

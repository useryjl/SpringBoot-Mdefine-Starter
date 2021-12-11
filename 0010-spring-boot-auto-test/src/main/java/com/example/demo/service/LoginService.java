package com.example.demo.service;

import com.example.demo.domain.Login;

/**
 * @author yjl
 * @Description
 * @create 2021-12-11
 */
public interface LoginService {
    Login query(String username);
}

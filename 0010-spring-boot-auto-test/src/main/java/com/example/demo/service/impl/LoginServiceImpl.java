package com.example.demo.service.impl;

import com.example.demo.dao.LoginDao;
import com.example.demo.domain.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yjl
 * @Description
 * @create 2021-12-11
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public Login query(String username) {
        return loginDao.queryByUsername(username);
    }
}

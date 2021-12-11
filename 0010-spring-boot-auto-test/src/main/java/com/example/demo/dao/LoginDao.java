package com.example.demo.dao;

import com.example.demo.domain.Login;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjl
 * @Description
 * @create 2021-12-11
 */
@Mapper
public interface LoginDao {
    Login queryByUsername(String username);
}

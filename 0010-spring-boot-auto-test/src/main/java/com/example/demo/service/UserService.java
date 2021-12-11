package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
public interface UserService {
    List<User> select();
    int update(User user);
    int delete(int id);
    int insert(User user);
    User selectById(int id);
}

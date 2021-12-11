package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
@Mapper
public interface UserDao {
    List<User> selectUser();


    User selectById(int id);

    //修改
    int Update(User user);

    int delete(int id);

    int insert(User user);
}

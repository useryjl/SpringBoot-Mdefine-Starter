package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
@Service
public class UserServiceImpl implements UserService {
    //业务层一定要有数据操作层的对象
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> select() {
        return userDao.selectUser();
    }

    @Override
    public int update(User user) {
        return userDao.Update(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }

}

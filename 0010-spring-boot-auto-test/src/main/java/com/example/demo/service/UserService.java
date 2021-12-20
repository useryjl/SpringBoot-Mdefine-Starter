package com.example.demo.service;

import com.example.demo.domain.Page;
import com.example.demo.domain.Prod;
import com.example.demo.domain.User;
import com.example.demo.vo.ProdInfoVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
public interface UserService {


    User test(List<Integer> id);

    List<Map<String,User>>  selectUserResultMap();

    List<User> selectpage(Page page);

    List<User> select();
    int update(User user);
    int delete(int id);

    Integer selectMaxId();
    int insert(User user);
    User selectById(int id);

    List<Prod> selectProd(ProdInfoVo prodInfoVo);
}

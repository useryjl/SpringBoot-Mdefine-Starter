package com.example.demo.dao;

import com.example.demo.domain.Page;
import com.example.demo.domain.Prod;
import com.example.demo.domain.User;
import com.example.demo.vo.ProdInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
@Mapper
public interface UserDao {
    List<User> selectUserpage(Page page);

    List<Map<String,User>> selectUserResultMap();


    User test(List<Integer> id);

    List<User> selectUser();

    User selectById(int id);  //单个参数 xml中取值#{任意格式}

    //修改
    int Update(User user);


    int delete(int id);


    Integer selectMaxId();


    //参数为javaBean  #{成员变量}  若使用@param注解则使用注解值.属性名
    int insert(@Param("javaBeanUser") User user);


    List selectProd(ProdInfoVo prodInfoVo);


    List<Prod> selectProdpage(Page page);
}

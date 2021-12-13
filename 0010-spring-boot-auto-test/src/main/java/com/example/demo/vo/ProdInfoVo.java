package com.example.demo.vo;

import lombok.Data;

/**
 * @author yjl
 * @Description
 * @create 2021-12-13
 */
@Data
public class ProdInfoVo {
    //封装前端传过来的按条件查询的类
    private String prod_name;
    private Integer prod_type;
    private Integer low_price;
    private Integer heigh_price;

}

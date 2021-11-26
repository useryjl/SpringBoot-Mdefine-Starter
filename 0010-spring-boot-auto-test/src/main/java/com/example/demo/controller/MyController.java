package com.example.demo.controller;

import com.yjl.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yjl
 * @Description
 * @create 2021-11-26
 */
@RestController
public class MyController {

    @Resource
    HelloService helloService;

    @RequestMapping("/hello")
    public String test(){
        String hello = helloService.hello();
        return  hello;
    }
}

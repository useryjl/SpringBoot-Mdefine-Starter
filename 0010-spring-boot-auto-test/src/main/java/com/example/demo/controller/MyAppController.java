package com.example.demo.controller;

import com.yjl.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author yjl
 * @Description
 * @create 2021-12-22
 */
@Controller
public class MyAppController {
    //自动配置类帮我们new 了一个对象 放在ioc容器中, 直接使用即可
    @Autowired
    HelloService helloService;

    public String hello(){
        //
        helloService.hello();
        return "";
    }
}

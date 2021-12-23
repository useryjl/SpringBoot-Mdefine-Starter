package com.example.demo.intecept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yjl
 * @Description
 * @create 2021-12-20
 */
@Configuration
public class LoginIntercept implements WebMvcConfigurer {
    /*
    * 添加拦截器 不登录不能进入主页面
    * */
    //将拦截器注入其中
    @Autowired
    private LoginHandlerInterceptor loginHandlerInterceptor;  //不用自己new 对象 spring容器使用ioc机制

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         //拦截一切请求，  访问其他页面必须登录才能进行
        // 排除登录请求页面jsp功能与逻辑验证功能
        //registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
        //        excludePathPatterns("/login/startlogin","/login/user").  //排除登录检查功能
        //        excludePathPatterns("/prodInfoVo");  //排除登录 后的产品查询功能

        registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/**").
                excludePathPatterns("/login/startlogin","/login/user").  //排除登录检查功能
                excludePathPatterns("/prodInfoVo");  //排除登录 后的产品查询功能
    }
}

package com.example.demo.intecept;

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
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截一切请求，
        // 排除登录请求页面jsp功能   排除登录验证的逻辑功能
        registry.addInterceptor(new Intercept()).addPathPatterns("/**").
                excludePathPatterns("/login/startlogin","/login/user");
    }
}

package com.example.demo.intecept;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yjl
 * @Description
 * @create 2021-12-20
 */
@Configuration
public class Intercept implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*拦截器执行之前执行*/
        //String username = (String) request.getAttribute("username");
        String username = (String) request.getSession().getAttribute("username");
        if (username!=null){
            //如果存在，则放行
            return true;
        }
        return false;
    }

}

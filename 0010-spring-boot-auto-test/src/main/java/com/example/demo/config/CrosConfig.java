package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
//@Configuration
//public class CrosConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")			          // 设置允许跨域的路径
//                .allowedOrigins("*")	              // 设置允许跨域请求的域名
//                .allowCredentials(true)				  // 是否允许证书 不再默认开启
//                .allowedMethods("GET", "POST", "HEAD", "PUT", "PATCH", "DELETE")						                  // 设置允许的方法
//                .maxAge(3600);						  // 允许跨域的时长
//    }
//}

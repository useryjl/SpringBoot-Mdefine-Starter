package com.yjl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author yjl
 * @Description
 * @create 2021-11-26
 */
public class HelloService {
    @Autowired
    HelloProperties helloProperties;

    public String hello(){
        return helloProperties.getStart()+",杨佳乐,"+helloProperties.getEnd();
    }

}

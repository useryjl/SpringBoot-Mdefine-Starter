package com.yjl.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author yjl
 * @Description
 * @create 2021-12-03
 */
public class ServletConList implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听全局作用域对象，servletContext 容器正在启动......start up");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("start down");
    }
}

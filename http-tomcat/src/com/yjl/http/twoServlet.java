package com.yjl.http;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author yjl
 * @Description
 * @create 2021-12-02
 */

public class twoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        Object name = servletContext.getAttribute("name");
        System.out.println("共享的数据："+name);


        /*
        * 请求作用域对象获取共享数据
        * */
        Object key2 = request.getAttribute("key2");
        System.out.println(key2);




        /*session 获取共享数据
        *
        * */
        HttpSession session = request.getSession();
        Object sessionAttribute = session.getAttribute("session-key");
        System.out.println("sessionAttribute:"+sessionAttribute);

        /*
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies){
            System.out.println(cookie);
            String name1 = cookie.getName();
            String value = cookie.getValue();
            System.out.println(name1+"--:--"+value);
        }
        */
    }
}

package com.yjl.http;

import com.yjl.domain.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.jsp.PageContext;
import java.io.IOException;

/**
 * @author yjl
 * @Description
 * @create 2021-12-02
 */
//代替web.xml的配置文件  访问oneServlet会找到该servlet接口的实现类
public class oneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //读取请求协议包中的请求参数 get请求从请求头中读取
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        //得到请求的url地址
        String requestURI = request.getRequestURI();
        int localPort = request.getLocalPort();

        //多个servlet共享数据  通过全局作用域对象（内存中）共享 全局作用域对象servletContext  一个网站只有一个
        //通过request对象向http服务器索要全局作用域对象
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("name",name);


        //调用请求对象向服务器索要session   session存在服务器端   会话作用域
        //创建session对象时  会在响应头中写入一个session.JSSONID; 游览器再次发送请求时，
        // 带上session.JSSONID,服务器就之知道要取那个session

        HttpSession session = request.getSession();
        session.setAttribute("username",new User("yjl"));


        //请求作用域对象 共享请求协议包时共享数据  请求转发方式，请求对象代替游览器向客户端发起请求   request
        //request.setAttribute("key2","value2");
        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/twoServlet");
        //requestDispatcher.forward(request,response);



        //存储在游览器的缓冲中
        Cookie cookie = new Cookie("key1", "value1");
        response.addCookie(cookie);

        //service处理完毕后，由response对象，负责将处理结果写入响应体中（二进制传输）。http服务器负责推送给游览器
        response.getWriter().print(name+","+age+"--"+"requestURI"+requestURI+","+"localPort"+localPort);





        /*
        * Http服务器启动时 创建OneServlet类的实例对象
        * 当http服务器第一次接受到请求时调用service方法里的doget/dopost 处理请求
        * request，response在第一次接受到请求时，服务器负责创建该对象。
        * request对象用于读取请求协议包中的内容，response对象用于将service方法的处理结果写入响应体中。
        *
        * b/s架构，消息在网络中是以二进制传递的；
        * 请求协议包： 请求行 请求头 空白行 请求体
        *   请求行:请求地址 请求方式；  请求头: get方式请求时，请求参数在请求头中；  请求体:post方式请求时，请求参数在请求体中；
        * 响应协议包： 状态码 响应头 空白行 响应体
        *   404 :服务器无资源 405：请求方式出错  500 服务器处理请求时、出现java异常。
        *   响应头中规定了游览器采用何种编译方式读取请求体中的内容。  默认二进制写入
        *
        *
        *
        *
        * */
    }
}

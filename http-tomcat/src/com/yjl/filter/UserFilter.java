package com.yjl.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yjl
 * @Description
 * @create 2021-12-03ServletContextListener
 */
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest  httpServletRequest=(HttpServletRequest) request;
        HttpServletResponse  httpServletResponse=(HttpServletResponse) response;
        HttpSession session = httpServletRequest.getSession();
        Object username = session.getAttribute("username");
        if (username!=null){
            System.out.println("------has been-login");
            //放行
            filterChain.doFilter(request,response);
        }else {
            httpServletRequest.getRequestDispatcher("/login").forward(httpServletRequest,httpServletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}

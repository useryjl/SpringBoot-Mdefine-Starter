package com.example.demo.controller;

import com.example.demo.domain.Login;
import com.example.demo.service.LoginService;
import com.example.demo.util.JsonResult;
import com.example.demo.util.LoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yjl
 * @Description
 * @create 2021-12-11
 */
@RequestMapping(value = "login")
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;


    @RequestMapping("/startlogin")
    public String login() {
        return "login";
    }

    //首页
    @RequestMapping("/buju")
    public String buju() {
        return "buju";
    }

    @RequestMapping(value = "/user")
    public ModelAndView login(@RequestParam("userName") String username, @RequestParam("userPwd") String userpwd,
                              HttpServletRequest request) {


        ModelAndView mv = new ModelAndView();
        String queryUserPwd="";
        if (username != null && username!="") {
            Login query = loginService.query(username);
            if (query!=null){
                queryUserPwd = query.getUserPwd();
            }
            if (query!=null&&userpwd.equals(queryUserPwd)){
                System.out.println("登录成功！");
                request.setAttribute("username", query.getUserName());
                JsonResult result = new JsonResult("登录成功", 200, query.getUserName());
                System.out.println(result);
                request.setAttribute("msg", "");
                //登录成功进入布局界面
                mv.setViewName("buju");
                return mv;
            }else {
                System.out.println("用户名或者密码错");
                request.setAttribute("msg", "用户名或者密码错错误");
                mv.setViewName("login");
                return mv;
            }
        }else {
            request.setAttribute("msg", "用户名或者密码错错误");
        }
        return mv;
    }
}


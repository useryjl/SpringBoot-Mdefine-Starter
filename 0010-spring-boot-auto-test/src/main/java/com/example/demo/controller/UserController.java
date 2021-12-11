package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.util.JsonResult;
import com.yjl.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
@CrossOrigin
@Controller
public class UserController {

    @Autowired
    UserService userService;

    //首页
    @RequestMapping("/index")
    public String index(){
        return "buju";
    }


    //首页
    @RequestMapping("/buju")
    public String buju(){
        return "buju";
    }

    @RequestMapping("/insertpage")
    public String insertpage(){
        return "insert";
    }

    //用户查询接口
    @ResponseBody
    @RequestMapping("/select")
    public JsonResult user(){
        //String msg, Integer code, Integer count, Object data
        //查出list集合
        List<User> userList = userService.select();
        JsonResult jsonResult = new JsonResult("查询成功", 200, userList.size(), userList);
        //System.out.println("userList:"+userList);
        return jsonResult;
    }


    //用户查询接口
    @ResponseBody
    @RequestMapping("/selectById")
    public JsonResult selectById(int id){
        User user = userService.selectById(id);
        JsonResult result = new JsonResult("查询成功", 200, user);
        return result;
    }

    //用户修改接口
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public JsonResult update(User user, HttpServletResponse response){ //form 表单传值过来 name值和实体类属性值一样 自动赋值
        int update = -1;
        JsonResult result=null;
        response.setContentType("application/json");
        update=userService.update(user);
        if (update>0){
             result = new JsonResult("修改成功", 200);
        }else {
             result = new JsonResult("修改失败",500);
        }
        return result;
    }

    //用户删除接口
    @ResponseBody
    @RequestMapping("/delete")
    public JsonResult delete(int id){ //form 表单传值过来 name值和实体类属性值一样 自动赋值
        int delete = -1;
        JsonResult result=null;
        delete=userService.delete(id);
        if (delete>0){
            result = new JsonResult("删除成功", 200);
        }else {
            result = new JsonResult("删除失败",500);
        }
        return result;
    }


    //用户新增接口
    @ResponseBody
    @RequestMapping("/insert")
    public JsonResult insert(User user){
        int insert=0;
        JsonResult result=null;
        insert=userService.insert(user);
        if (insert>0){
            result = new JsonResult("新增成功", 200);
        }else {
            result = new JsonResult("新增失败",500);
        }
        return result;
    }
}

package com.example.demo.controller;

import com.example.demo.domain.Page;
import com.example.demo.domain.Prod;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.util.JsonResult;
import com.example.demo.vo.ProdInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yjl.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yjl
 * @Description
 * @create 2021-12-16
 */
@Controller
public class UserController {

     Logger logger= LoggerFactory.getLogger(UserController.class);

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





    @ResponseBody
    @RequestMapping("/selectUserResultMap")
    public JsonResult selectUserResultMap(){
        List<Map<String, User>> mapList = userService.selectUserResultMap();
        //list中存放查询到的数据 其中一行数据作为一个map
        System.out.println(mapList);
        for(int i=0;i<mapList.size();i++){
            User user = mapList.get(i).get("room_id");
            System.out.println("user:"+user);


        }
        //for (Map<String,User> map:mapList){
        //    System.out.println(map);
        //}
        JsonResult jsonResult = new JsonResult("查询成功", 200, mapList.size(), mapList);
        //System.out.println("userList:"+userList);
        return jsonResult;
    }







    //用户查询接口
    @ResponseBody
    @RequestMapping("/select")
    public JsonResult user(){
        //String msg, Integer code, Integer count, Object data
        //查出list集合
        List<User> userList = userService.select();
        JsonResult jsonResult = new JsonResult("查询成功", 200, userList.size(), userList);
        System.out.println("jsonResult:"+jsonResult);
        //System.out.println("userList:"+userList);
        return jsonResult;
    }


    //用户查询接口 分页
    @ResponseBody
    @RequestMapping("/selectPage")
    public JsonResult userSelectPage(Page page){
        //
        System.out.println(page.getPage()+","+page.getPage());
        PageHelper.startPage(page.getPage(),page.getLimit());  //开始分页

        List<User> userList = userService.selectpage(page);

        //PageInfo 我们分页以后的数据被封装到pageinf中
        PageInfo<User> pageInfo=new PageInfo<>(userList);  //将查询的数据放入pageInfo中构建分页信息

        System.out.println(pageInfo);

        JsonResult resultPage = new JsonResult("分页查询成功", 200, pageInfo.getPageSize(),pageInfo.getList());

        //返回给前端我满们分页的数据
        return resultPage;
    }


    //用户查询接口
    @ResponseBody
    @RequestMapping("/selectById")
    public JsonResult selectById(int id){
        User user = userService.selectById(id);
        //
        new JsonResult("返回狀態碼200,layui数据表格要做相应的处理  默认 0",200);
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




    //selectMaxId
    @ResponseBody
    @RequestMapping("/selectMaxId")
    public JsonResult selectMaxId(){
        JsonResult jsonResult=null;
        Integer integer = userService.selectMaxId();
        //integer是id最大值加1
        if (integer!=null&&integer>0){
            logger.info("integer:"+integer);
             jsonResult = new JsonResult("查询最大值成功", 200, integer);
             //integer在json中返回
        }

        return jsonResult;
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



    @ResponseBody
    @RequestMapping("/foreach")
    public JsonResult foreach(){
        JsonResult result=null;
        List<Integer> id=new ArrayList<>();
        id.add(20239223);
        id.add(20239222);
        id.add(20239221);

        User test = userService.test(id);
        System.out.println(test);
        if (test!=null){
            result = new JsonResult("foreach查询成功", 200);
        }else {
            result = new JsonResult("foreach查询失败",500);
        }
        return result;
    }







    //ProdController
    @ResponseBody
    @RequestMapping("/prodInfoVo")
    //ProdInfoVo 封装我们条件查询的数据 传到sql中
    public JsonResult prodSelect(ProdInfoVo prodInfoVo){
        ModelAndView modelAndView = new ModelAndView();
        //实体类接收 sql中需要#{属性名}
        JsonResult result=null;
        //前端封装的查询条件  prodInfoVo  name与属性相同则会进行映射

        List<Prod> prods = userService.selectProd(prodInfoVo);
        if (prods.size()>0){
            //
            modelAndView.addObject("prods",prods);
            result = new JsonResult("查询成功", 200,prods.size(),prods);

        }else {
            result = new JsonResult("查询失败",500);
        }
        return result;
    }




    @ResponseBody
    @RequestMapping("/prodInfoVoPage")
    public JsonResult prodSelectPage(Page page){  //page limit
        ModelAndView modelAndView = new ModelAndView();
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(page.getPage(),page.getLimit());  //将分页数据放入pagehelper中
        JsonResult result=null;
        List<Prod> prods = userService.selectProd(page);
        PageInfo<Prod> pageInfo=new PageInfo<>(prods);  //分页信息放入PageInfo中
        if (prods.size()>0){
            modelAndView.addObject("prods",prods);
            System.out.println("pageInfo:"+pageInfo);
            result = new JsonResult("查询成功", 200,pageInfo.getSize(),pageInfo.getList());

        }else {
            result = new JsonResult("查询失败",500);
        }
        return result;
    }
}

package com.springboot.springbootshop.controller;


import com.springboot.springbootshop.model.Admin;
import com.springboot.springbootshop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/Admin/getadmin")
    @ResponseBody
    public List<Admin> admin(){

     return adminService.getAllAdmin();
    }

    /*
    //用来测试springboot的事物机制
    运行报错 by zero 说明出现了分母为0的异常 触发事物回滚  update的操作回滚不对数据库进行更改
    */
    @GetMapping("/Admin/updateadmin")
    @ResponseBody
    public void uopdateAdmin(){
        adminService.update();

    }

     /*
    用来测试 RESTFULL 一种理念 叫Rest风格
    使用@PathVariable 注解就可以实现
    他可以获取到url中数据 为RESTFULL最主要的注解
    比如要访问一个http接口 http://localhost:8080/boot/api/order?id=15&status=2
    采用RESTFULL的http地址为  http://localhost:8080/boot/api/order/15/2

    比如要访问 http://localhost:8080/springboot-web/Admin/RESTFULL/10
    @PathVariable("id")Integer id 就可以把10拿到id上面来

    当然你也可以多加几个
    @GetMapping("/Admin/RESTFULL/{id}/{name}")
    @PathVariable("id")Integer id,@PathVariable("name")String name

     */
     @GetMapping("/Admin/RESTFULL/{id}")
     @ResponseBody
     public Admin testRESTFULL(@PathVariable("id")Integer id){
         Admin a=new Admin();
         a.setAid(id);
         a.setName("admin");
         a.setPassword("123456");
         return  a;

     }

}

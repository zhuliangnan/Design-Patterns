package com.springboot.springbootshop.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 自动配置的读取方式之一 采用 value方式读取
 *
 * */

@Controller
public class myconf {

    @Value("${webproject.projectname}")
    private String projectname;
    @Value("${webproject.developer}")
    private String developer;

    @RequestMapping("/getProjectdetail")
    @ResponseBody
    public String getProjectdetail(){

        return "WADQWDQW"+projectname+" "+developer;


    }
}

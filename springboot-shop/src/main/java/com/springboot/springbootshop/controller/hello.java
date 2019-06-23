package com.springboot.springbootshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* @RestController 是@Controller 与 @ResponseBody 的组合注解
* 添加了之后,都返回的是字符串或者json数据
*
*@GetMapping 是@RequestMapping和Get请求的组合
*@PostMapping 是@RequestMapping和Post请求的组合
*@PutMapping  是@RequestMapping和Put请求的组合 修改操作 可以用Post代替
*@DeleteMapping 是@RequestMapping和Delete请求的组合 删除操作 可以用Get代替
* */
@Controller
public class hello {

    @RequestMapping("/boot/hello")
    @ResponseBody
    public String hellospringbbot(){
        return  "第一个springboot";


    }


    //@GetMapping 的使用
    @RequestMapping(value="/boot/GetMapping",method = RequestMethod.GET)
    @ResponseBody
    public String GetMapping(){
        return  "第一个springboot";


    }

/*
    等价于上面的method = RequestMethod.GET
    @GetMapping("/boot/GetMapping")
    @ResponseBody
    public String GetMapping(){
        return  "第一个springboot";


    }
*/

//跳到jsp
@RequestMapping("/jsp")
public String runjsp(Model model){
    model.addAttribute("message","springboot 集成jsp");
    return  "adminmain";


}


}

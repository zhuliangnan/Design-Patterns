package com.springboot.springbootshop.service.impl;

import com.springboot.springbootshop.mapper.AdminMapper;
import com.springboot.springbootshop.model.Admin;
import com.springboot.springbootshop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service  //加入@Service注解变为spring的bean
public class AdminServiceImpl implements AdminService {

    //使用@Autowired将AdminMapper注入
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> getAllAdmin() {
        return adminMapper.getAllAdmin();
    }

    @Transactional  //用来表示我这个方法是有事物的
    @Override
    public int update() {
        Admin a=new Admin();
        a.setAid(1);
        a.setName("admin");
        a.setPassword("123456");
        int updatenumber=adminMapper.updateByPrimaryKeySelective(a);
        System.out.println("更新了"+updatenumber+"条");
       //用来抛出一个运行时异常 除数不为0  这时候上一步的更新就会回滚 这是@Transactional 发挥的作用
        int b=10/0;

        return updatenumber;
    }
}

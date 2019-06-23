package com.springboot.springbootshop.service;

import com.springboot.springbootshop.model.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> getAllAdmin();
    //用来测试事物的update方法
    public  int update();
}

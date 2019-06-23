package com.springboot.springbootshop.mapper;

import com.springboot.springbootshop.model.Admin;
import com.springboot.springbootshop.model.AdminKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//加入@Mapper注解使之变为Spring的bean
//@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(AdminKey key);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(AdminKey key);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

     List<Admin> getAllAdmin();
}
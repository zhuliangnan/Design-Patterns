package com.springboot.springbootshop.model;

public class Admin extends AdminKey {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
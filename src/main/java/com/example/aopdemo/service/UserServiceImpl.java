package com.example.aopdemo.service;

public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(String name) {
        System.out.println("保存用户:" + name);
        throw new RuntimeException("runtime Ex");
    }
}

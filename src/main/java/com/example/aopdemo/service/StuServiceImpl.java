package com.example.aopdemo.service;

import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements UserService {

    @Override
    public void saveUser(String name) {
        System.out.println("保存学生用户:" + name);
    }
}

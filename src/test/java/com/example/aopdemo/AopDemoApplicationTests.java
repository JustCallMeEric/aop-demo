package com.example.aopdemo;

import com.example.aopdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class AopDemoApplicationTests {

    @Autowired
    @Qualifier("stuServiceImpl")
    private UserService userService;

    @Test
    void contextLoads() {
        // 基于xml
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.saveUser("Eric");
        System.out.println(userService.getClass());
    }

    @Test
    void execute() {
        // 基于注解
        userService.saveUser("Eric");
    }
}

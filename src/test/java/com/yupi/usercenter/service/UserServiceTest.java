package com.yupi.usercenter.service;
import java.util.Date;

import com.yupi.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *用户服务测试
 *  @author zhangruyi
 */
import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser(){
        User user = new User();
        user.setUsername("dogYupi");
        user.setUserAccount("123");
        user.setAvatarUrl("111");
        user.setGender((byte)0);
        user.setUserPassword("11");
        user.setPhone("123");
        user.setEmail("124");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccout = "yupi";
        String userPassword = "";
        String checkPassword="123456";
        long result = userService.userRegister(userAccout, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);

        userAccout ="yu";
        userService.userRegister(userAccout,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

        userAccout = "yupi";
        userPassword="123456";
        userService.userRegister(userAccout,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);
        userAccout="yu pi";
        userPassword="12345678";
        result = userService.userRegister(userAccout,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);
        checkPassword="123456789";
        userService.userRegister(userAccout,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);
        userAccout="dogYupi";
        checkPassword="12345678";
        userService.userRegister(userAccout,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);
        userAccout="yupi8";
        userService.userRegister(userAccout,userPassword,checkPassword);
        Assertions.assertEquals(-1,result);

    }
}
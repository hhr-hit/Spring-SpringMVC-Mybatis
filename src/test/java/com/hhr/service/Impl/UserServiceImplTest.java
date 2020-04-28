package com.hhr.service.Impl;

import com.hhr.BaseTest;
import com.hhr.entity.User;
import com.hhr.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserServiceImplTest extends BaseTest {

    @Autowired
    //@Resource
    private UserService userService;

    @Test
    public void testAddUser() throws Exception {
        //Date date = new Date();
        java.util.Date utilDate=new Date();
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        User user = new User(123,"abc", "天涯", sqlDate);
        int add = userService.add(user);
        System.out.println(add);
    }

    @Test
    public  void testQueryOn() throws Exception {
        int us = userService.queryOn(123);
            System.out.println(us);
    }

//    @Test
//    public  void testQueryTime() throws Exception {
//        Date sd = userService.queryTime(123);
//            System.out.println(sd);
//    }

    @Test
    public  void testQueryName() throws Exception {
        String un = userService.queryName(123);
            System.out.println(un);
    }

}

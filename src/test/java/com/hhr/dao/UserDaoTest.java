package com.hhr.dao;

import com.hhr.BaseTest;

import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

public class UserDaoTest extends BaseTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testInsertUser() throws Exception {
        //Date date = new Date();
        int insert = userDao.insertUser(
                123,
                "abc",
                "天涯");
        System.out.println("insert=" + insert);
    }

    @Test
    public void testIsOnlineA() throws Exception {
        int userstate = userDao.isOnline(123);
            System.out.println(userstate);
    }

//    @Test
//    public void testWhenSign() throws Exception {
//        Date signupdate = userDao.whenSign(123);
//        System.out.println(signupdate);
//    }

    @Test
    public void testWhatNameU() throws Exception {
        String name = userDao.whatName(123);
        System.out.println(name);
    }

}

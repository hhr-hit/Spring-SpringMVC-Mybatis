package com.hhr.service.Impl;

import com.hhr.dao.UserDao;
import com.hhr.entity.User;

import com.hhr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入Service依赖
    @Autowired
    private UserDao userDao;

    @Override
    public int add(User a) {
        //新建用户记录
        return userDao.insertUser(
                a.getAccountid(),
                a.getAccountpwd(),
                a.getUsername());
    }

    @Override
    public int queryOn(int accountid) {
        //查询用户在线状态
        return userDao.isOnline(accountid);
    }

//    @Override
//    public Date queryTime(int accountid) {
//        //查询用户注册时间
//        return userDao.whenSign(accountid);
//    }

    @Override
    public String queryName(int accountid) {
        //查询用户用户昵称
        return userDao.whatName(accountid);
    }

    @Override
    public int delete(int accountid) {
        //空方法
        return 0;
    }

    @Override
    public int update(User u) {
        //空方法
        return 0;
    }

}

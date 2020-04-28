package com.hhr.service;

/**
 * User业务接口
 */

import com.hhr.entity.User;

import java.sql.Timestamp;
import java.util.Date;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

public interface UserService {

    /**
     * 功能：新建用户表记录
     * 参数：accountid，accountpwd，username(用户输入)
     * 参数：signupdate(系统获取)，userstate(系统默认0，未登陆)
     * 返回：插入的行数
     */
//    int add(int accountid, String accountpwd,
//            String username, Date signupdate, int userstate);
    int add(User a);

    /**
     * 功能：查询用户表记录 在线状态
     * 参数：accountid(用户输入)
     * 返回：用户记录集合
     */
    int queryOn(int accountid);

    /**
     * 功能：查询用户表记录 注册时间
     * 参数：accountid(用户输入)
     * 返回：用户记录集合
     */
    //Date queryTime(int accountid);

    /**
     * 功能：查询用户表记录 用户昵称
     * 参数：accountid(用户输入)
     * 返回：用户记录集合
     */
    String queryName(int accountid);

    /**
     * 功能：删除用户表记录
     * 参数：accountid(用户输入)
     * 返回：操作的行数
     */
    int delete(int accountid);

    /**
     * 功能：更新用户表记录
     * 参数：accountid(用户输入)
     * 返回：插入的行数
     */
    int update(User u);

}

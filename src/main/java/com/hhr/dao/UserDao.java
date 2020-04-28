package com.hhr.dao;

/**
 * 自定义User的数据库接口规范
 * 在此定义的接口函数都是封装的SQL语句
 * 返回值有自然的SQL限制，不能自己定义
 */

import com.hhr.entity.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

import java.util.Date;

import java.util.List;

@Repository
public interface UserDao {

    /**
     *  参数  accountid，accountpwd，username，signupdate
     *  操作  向数据库的 user表 中插入一条记录
     *  返回  SQL查询结果 插入的行数
     */
    int insertUser(@Param("accountid") int accountid,
                   @Param("accountpwd") String accountpwd,
                   @Param("username") String username
    );

    /**
     *  参数  accountid
     *  操作  查询数据库的 user表 中此 账户id 或 用户id 的 登陆在线状态
     *  返回  SQL查询结果 1则Online（1），0则NotOnline（0）
     */
    int isOnline(@Param("accountid") int accountid);

    /**
     *  参数  accountid
     *  操作  查询账户注册时间
     *  操作  将数据库中对应的 DataTime 格式数据
     *  操作  通过 TimeStamp 转为 Java 的 Data 格式
     *  操作  再 Format 转为 String 格式
     *  返回  SQL查询结果 注册时间 String 格式
     */
    //Date whenSign(@Param("accountid") int accountid);

    /**
     *  参数  accountid
     *  操作  查询数据库的 user表 中此 账户id 的 用户昵称
     *  返回  SQL查询结果 用户昵称
     */
    String whatName(@Param("accountid") int accountid);

}

package com.hhr.dao;

/**
 * 自定义Account的数据库接口规范
 * 在此定义的接口函数都是封装的SQL语句
 * 返回值有自然的SQL限制，不能自己定义
 */

import com.hhr.entity.Account;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

import java.util.Date;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     *  参数  accountid，accountpwd，signupdate @Param("signupdate") Date signupdate
     *  操作  向数据库的 account表 中插入一条记录
     *  返回  SQL查询结果 插入的行数
     */
    int insertAccount(@Param("accountid") int accountid,
                      @Param("accountpwd") String accountpwd
    );

    /**
     *  参数  accountid
     *  操作  (注册/登陆)查询数据库的 account表 中是否有此 账户id
     *  返回  SQL查询结果 不为空则Exist（1），否则NotExist（0）
     */
    List<Account> isExist(@Param("accountid") int accountid);

    /**
     *  参数  accountid，accountpwd
     *  操作  查询数据库记录中的 账户id 是否与 账户密码 匹配
     *  返回  SQL查询结果 不为空则Success（1），否则Fail（0）
     */
    List<Account> isMatch(@Param("accountid") int accountid,
                @Param("accountpwd") String accountpwd
    );

    /**
     *  参数  accountid
     *  操作  查询账户注册时间
     *  操作  将数据库中对应的 DataTime 格式数据
     *  操作  通过 TimeStamp 转为 Java 的 Data 格式
     *  操作  再 Format 转为 String 格式
     *  返回  注册时间 Timestamp 格式（手动转换为Date格式）
     */
    //Date whenSign(@Param("accountid") int accountid);

}

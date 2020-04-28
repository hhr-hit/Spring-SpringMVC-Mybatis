package com.hhr.service;

/**
 * Account业务接口
 */

import com.hhr.entity.Account;

import java.util.Date;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

public interface AccountService {

    /**
     * 功能：新建账户表记录
     * 参数：accountid，accountpwd(用户输入)
     * 参数：signupdate(系统获取)
     * 返回：插入的行数
     */
    //int add(int accountid, String accountpwd, Date signupdate);
    int add(Account a);

    /**
     * 功能：查询账户存在
     * 参数：accountid(用户输入)
     * 返回：账户记录集合
     */
    List<Account> query(int accountid);

    /**
     * 功能：检查账户密码
     * 参数：accountid(用户输入)
     * 返回：账户记录集合
     */
    List<Account> check(int accountid, String accountpwd);

    /**
     * 功能：删除账户表记录
     * 参数：accountid(用户输入)
     * 返回：操作的行数
     */
    int delete(int accountid);

    /**
     * 功能：更新账户表记录
     * 参数：accountid(用户输入)
     * 返回：插入的行数
     */
    int update(Account u);

}

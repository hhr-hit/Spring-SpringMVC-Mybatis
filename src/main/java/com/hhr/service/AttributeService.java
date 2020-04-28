package com.hhr.service;

/**
 * Attribute业务接口
 */

import com.hhr.entity.Attribute;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

public interface AttributeService {

    /**
     * 功能：新建玩家属性表记录
     * 参数：accountid，accountpwd，username(用户输入)
     * 参数：signupdate(系统获取)，userstate(系统默认0，未登陆)
     * 返回：插入的行数
     */
    //int add(int accountid);
    int add(Attribute a);

    /**
     * 功能：查询玩家属性表记录
     * 参数：accountid(系统获取)
     * 返回：用户记录集合
     */
    Attribute query(int accountid);

    /**
     * 功能：删除玩家属性表记录
     * 参数：accountid(系统获取)
     * 返回：操作的行数
     */
    int delete(int accountid);

    /**
     * 功能：更新玩家属性表记录
     * 参数：accountid(系统获取)，Attribute内容
     * 返回：插入的行数
     */
    int update(Attribute u);

}

package com.hhr.service;

/**
 * Function业务接口
 */

import com.hhr.entity.Function;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

public interface FunctionService {

    /**
     * 功能：新建功能表记录
     * 参数：accountid(系统获取)
     * 返回：插入的行数
     */
    //int add(int accountid);
    int add(Function a);

    /**
     * 功能：查询功能表记录
     * 参数：accountid(系统获取)
     * 返回：用户记录集合
     */
    Function query(int accountid);

    /**
     * 功能：删除功能表记录
     * 参数：accountid(系统获取)
     * 返回：操作的行数
     */
    int delete(int accountid);

    /**
     * 功能：更新功能表记录
     * 参数：accountid(系统获取)
     * 返回：插入的行数
     */
    int update(Function u);

}

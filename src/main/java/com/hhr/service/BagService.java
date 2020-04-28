package com.hhr.service;

/**
 * Bag业务接口
 */

import com.hhr.entity.Bag;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

public interface BagService {

    /**
     * 功能：新建背包表记录
     * 参数：accountid(系统获取)
     * 返回：插入的行数
     */
    //int add(int accountid);
    int add(Bag a);

    /**
     * 功能：查询背包表记录
     * 参数：accountid(系统获取)
     * 返回：用户记录集合
     */
    Bag query(int accountid);

    /**
     * 功能：删除背包表记录
     * 参数：accountid(系统获取)
     * 返回：操作的行数
     */
    int delete(int accountid);

    /**
     * 功能：更新背包表记录
     * 参数：accountid(系统获取)
     * 返回：插入的行数
     */
    int update(Bag u);

}

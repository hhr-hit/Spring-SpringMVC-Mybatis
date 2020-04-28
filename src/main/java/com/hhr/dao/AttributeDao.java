package com.hhr.dao;

/**
 * 自定义Attribute的数据库接口规范
 * 在此定义的接口函数都是封装的SQL语句
 * 返回值有自然的SQL限制，不能自己定义
 */

import com.hhr.entity.Attribute;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeDao {

    /**
     *  参数  accountid
     *  操作  向数据库的 attribute表 中插入一条记录
     *  返回  SQL查询结果 插入的行数
     */
    int insertAttribute(@Param("accountid") int accountid);

    /**
     *  参数  accountid
     *  操作  查询数据库的 attribute表 中对应记录的所有表项
     *  返回  SQL查询结果 一个Attribute对象
     */
    Attribute queryAttribute(@Param("accountid") int accountid);

    /**
     *  参数  Attribute
     *  操作  向数据库的 attribute表 更新记录
     *  返回  SQL查询结果 插入的行数
     */
    int updateAttribute(@Param("accountid") int accountid,
                        @Param("level") int level,
                        @Param("title") String title,
                        @Param("exnow") int exnow,
                        @Param("exneed") int exneed,
                        @Param("vip") int vip,
                        @Param("hp") int hp,
                        @Param("atk") int atk,
                        @Param("def") int def,
                        @Param("sp") int sp
    );

}

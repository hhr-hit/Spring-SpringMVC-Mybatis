package com.hhr.dao;

/**
 * 自定义Function的数据库接口规范
 * 在此定义的接口函数都是封装的SQL语句
 * 返回值有自然的SQL限制，不能自己定义
 */

import com.hhr.entity.Function;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionDao {

    /**
     *  参数  accountid
     *  操作  向数据库的 function表 中插入一条记录
     *  返回  SQL查询结果 插入的行数
     */
    int insertFunction(@Param("accountid") int accountid);

    /**
     *  参数  accountid
     *  操作  查询数据库的 function表 中对应记录的所有表项
     *  返回  SQL查询结果 一个Function对象
     */
    Function queryFunction(@Param("accountid") int accountid);

    /**
     *  参数  Function
     *  操作  向数据库的 function表 更新记录
     *  返回  SQL查询结果 插入的行数
     */
    int updateFunction(@Param("accountid") int accountid,
                  @Param("usebag") int usebag,
                  @Param("makefire") int makefire,
                  @Param("cuttree") int cuttree,
                  @Param("collectwater") int collectwater,
                  @Param("makebait") int makebait,
                  @Param("placetrap") int placetrap,
                  @Param("makebacon") int makebacon,
                  @Param("train") int train,
                  @Param("makeshoes") int makeshoes,
                  @Param("makearmor") int makearmor,
                  @Param("makehelmet") int makehelmet,
                  @Param("makeweapon") int makeweapon,
                  @Param("dungeon01") int dungeon01
    );

}

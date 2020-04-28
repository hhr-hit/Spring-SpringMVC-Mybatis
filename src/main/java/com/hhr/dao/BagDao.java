package com.hhr.dao;

/**
 * 自定义Bag的数据库接口规范
 * 在此定义的接口函数都是封装的SQL语句
 * 返回值有自然的SQL限制，不能自己定义
 */

import com.hhr.entity.Bag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BagDao {

    /**
     *  参数  accountid
     *  操作  向数据库的 bag表 中插入一条记录
     *  返回  SQL查询结果 插入的行数
     */
    int insertBag(@Param("accountid") int accountid);

    /**
     *  参数  accountid
     *  操作  查询数据库的 bag表 中对应记录的所有表项
     *  返回  SQL查询结果 一个Bag对象
     */
    Bag queryBag(@Param("accountid") int accountid);

    /**
     *  参数  Bag
     *  操作  向数据库的 bag表 更新记录
     *  返回  SQL查询结果 插入的行数
     */
    int updateBag(@Param("accountid") int accountid,
                  @Param("allplace") int allplace,
                  @Param("usedplace") int usedplace,
                  @Param("allspace") int allspace,
                  @Param("usedspace") int usedspace,
                  @Param("goldcoin") int goldcoin,
                  @Param("weaponname") String weaponname,
                  @Param("weaponscript") String weaponscript,
                  @Param("weaponspace") int weaponspace,
                  @Param("armorname") String armorname,
                  @Param("armorscript") String armorscript,
                  @Param("armorspace") int armorspace,
                  @Param("shoesname") String shoesname,
                  @Param("shoesscript") String shoesscript,
                  @Param("shoesspace") int shoesspace,
                  @Param("helmetname") String helmetname,
                  @Param("helmetscript") String helmetscript,
                  @Param("helmetspace") int helmetspace
    );

}

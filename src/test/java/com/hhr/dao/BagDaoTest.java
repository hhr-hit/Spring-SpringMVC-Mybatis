package com.hhr.dao;

import com.hhr.BaseTest;

import com.hhr.entity.Bag;
import org.junit.Test;

import javax.annotation.Resource;

public class BagDaoTest extends BaseTest {

    @Resource
    private BagDao bagDao;

    @Test
    public void testInsertBag() throws Exception {
        int insert = bagDao.insertBag(123);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryBag() throws Exception {
        Bag bag = bagDao.queryBag(123);
        System.out.println(bag);
    }

}

package com.hhr.dao;

import com.hhr.BaseTest;

import com.hhr.entity.Function;
import org.junit.Test;

import javax.annotation.Resource;

public class FunctionDaoTest extends BaseTest {

    @Resource
    private FunctionDao functionDao;

    @Test
    public void testInsertFunction() throws Exception {
        int insert = functionDao.insertFunction(123);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryFunction() throws Exception {
        Function function = functionDao.queryFunction(123);
        System.out.println(function);
    }

}

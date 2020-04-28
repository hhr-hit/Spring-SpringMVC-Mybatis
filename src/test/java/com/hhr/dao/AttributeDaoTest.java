package com.hhr.dao;

import com.hhr.BaseTest;

import com.hhr.entity.Attribute;
import org.junit.Test;

import javax.annotation.Resource;

public class AttributeDaoTest extends BaseTest {

    @Resource
    private AttributeDao attributeDao;

    @Test
    public void testInsertAttribute() throws Exception {
        int insert = attributeDao.insertAttribute(123);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryAttribute() throws Exception {
        Attribute attribute = attributeDao.queryAttribute(123);
        System.out.println(attribute);
    }

}

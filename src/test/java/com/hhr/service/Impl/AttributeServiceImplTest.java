package com.hhr.service.Impl;

import com.hhr.BaseTest;
import com.hhr.entity.Attribute;
import com.hhr.service.AttributeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AttributeServiceImplTest extends BaseTest {

    @Autowired
    //@Resource
    private AttributeService attributeService;

    @Test
    public void testAddAttribute() throws Exception {
        Attribute attribute = new Attribute(123);
        int add = attributeService.add(attribute);
        System.out.println(add);
    }

    @Test
    public  void testQuery() throws Exception {
        Attribute attribute = attributeService.query(123);
        System.out.println(attribute);
    }

}

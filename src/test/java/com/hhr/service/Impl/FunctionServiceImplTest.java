package com.hhr.service.Impl;

import com.hhr.BaseTest;
import com.hhr.entity.Function;
import com.hhr.service.FunctionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class FunctionServiceImplTest extends BaseTest {

    @Autowired
    //@Resource
    private FunctionService functionService;

    @Test
    public void testAddFunction() throws Exception {
        Function function = new Function(123);
        int add = functionService.add(function);
        System.out.println(add);
    }

    @Test
    public  void testQuery() throws Exception {
        Function function = functionService.query(123);
        System.out.println(function);
    }

}

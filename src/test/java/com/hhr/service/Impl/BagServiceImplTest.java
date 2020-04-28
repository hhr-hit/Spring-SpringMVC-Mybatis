package com.hhr.service.Impl;

import com.hhr.BaseTest;
import com.hhr.entity.Bag;
import com.hhr.service.BagService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BagServiceImplTest extends BaseTest {

    @Autowired
    //@Resource
    private BagService bagService;

    @Test
    public void testAddBag() throws Exception {
        Bag bag = new Bag(123);
        int add = bagService.add(bag);
        System.out.println(add);
    }

    @Test
    public  void testQuery() throws Exception {
        Bag bag = bagService.query(123);
        System.out.println(bag);
    }

}

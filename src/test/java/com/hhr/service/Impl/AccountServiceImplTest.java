package com.hhr.service.Impl;

import com.hhr.BaseTest;

import com.hhr.entity.Account;
import com.hhr.service.AccountService;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImplTest extends BaseTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testAddAccount() throws Exception {
//        Date date = new Date();
//        java.util.Date utilDate=new Date();
//        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        Account account = new Account(123,"abc");
        int add = accountService.add(account);
        System.out.println(add);
    }

    @Test
    public  void testQuery() throws Exception {
        List<Account> accounts = accountService.query(123);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public  void testCheck() throws Exception {
        List<Account> accounts = accountService.check(123, "abc");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}

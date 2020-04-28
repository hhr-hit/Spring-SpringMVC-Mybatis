package com.hhr.dao;

import com.hhr.BaseTest;

import com.hhr.entity.Account;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class AccountDaoTest extends BaseTest {

    @Resource //不加会有空指针异常
    private AccountDao accountDao;

    @Test
    public void testInsertAccount() throws Exception {
        /**
         * 将String转为Date： new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(dateStr)
         * 方法返回Date对象
         * 将String转为Timestamp： Timestamp.valueOf(tsStr)
         * 方法返回Timestamp对象
         */
        //Date date = new Date();
        int insert = accountDao.insertAccount(
                    123,
                    "abc");
        System.out.println("insert=" + insert);
    }

    @Test
    public void testIsExist() throws Exception {
        List<Account> accounts = accountDao.isExist(123);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testIsMatch() throws Exception {
        List<Account> accounts = accountDao.isMatch(123, "abc");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

//    @Test
//    public void testWhenSign() throws Exception {
//        Date signupdate = accountDao.whenSign(123);
//        System.out.println(signupdate);
//    }

}

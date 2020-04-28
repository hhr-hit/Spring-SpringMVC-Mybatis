package com.hhr.service.Impl;

import com.hhr.dao.AccountDao;
import com.hhr.entity.Account;
import com.hhr.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.logging.Logger;

@Service
public class AccountServiceImpl implements AccountService {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入Service依赖
    @Autowired
    private AccountDao accountDao;

    @Override
    public int add(Account a) {
        //新建账户记录
        return accountDao.insertAccount(
                a.getAccountid(),
                a.getAccountpwd());
    }

    @Override
    public List<Account> query(int accountid) {
        //查询账户是否存在
        List<Account> accounts =
                accountDao.isExist(accountid);
        return accounts;
    }

    @Override
    public List<Account> check(int accountid, String accountpwd) {
        //检查账户密码是否匹配
        List<Account> accounts =
                accountDao.isMatch(accountid, accountpwd);
        return accounts;
    }

    @Override
    public int delete(int accountid) {
        //空方法
        return 0;
    }

    @Override
    public int update(Account u) {
        //空方法
        return 0;
    }

    /**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */

    /**
     * log用于手动捕获异常
     */

}

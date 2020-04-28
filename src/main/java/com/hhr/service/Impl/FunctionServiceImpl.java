package com.hhr.service.Impl;

import com.hhr.dao.FunctionDao;
import com.hhr.entity.Function;
import com.hhr.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionServiceImpl implements FunctionService {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入Service依赖
    @Autowired
    private FunctionDao functionDao;

    @Override
    public int add(Function a) {
        //新建功能表记录
        return functionDao.insertFunction(a.getAccountid());
    }

    @Override
    public Function query(int accountid) {
        //查询功能表记录
        return functionDao.queryFunction(accountid);
    }

    @Override
    public int delete(int accountid) {
        //空方法
        return 0;
    }

    @Override
    public int update(Function u) {
        //更新功能表
        functionDao.updateFunction(u.getAccountid(), u.getUsebag(), u.getMakefire(),
                u.getCuttree(), u.getCollectwater(), u.getMakebait(), u.getPlacetrap(),
                u.getMakebacon(), u.getTrain(), u.getMakeshoes(), u.getMakearmor(),
                u.getMakehelmet(), u.getMakeweapon(), u.getDungeon01());
        return 0;
    }

}

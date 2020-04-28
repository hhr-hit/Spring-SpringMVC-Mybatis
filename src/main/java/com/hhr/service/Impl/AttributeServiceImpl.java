package com.hhr.service.Impl;

import com.hhr.dao.AttributeDao;

import com.hhr.entity.Attribute;

import com.hhr.service.AttributeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttributeServiceImpl implements AttributeService {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入Service依赖
    @Autowired
    private AttributeDao functionDao;

    @Override
    public int add(Attribute a) {
        //新建玩家属性表记录
        return functionDao.insertAttribute(a.getAccountid());
    }

    @Override
    public Attribute query(int accountid) {
        //查询玩家属性表记录
        return functionDao.queryAttribute(accountid);
    }

    @Override
    public int delete(int accountid) {
        //空方法
        return 0;
    }

    @Override
    public int update(Attribute u) {
        //更新属性数据
        functionDao.updateAttribute(u.getAccountid(), u.getLevel(),
                u.getTitle(), u.getExnow(), u.getExneed(), u.getVip(),
                u.getHp(), u.getAtk(), u.getDef(),u.getSp());
        return 0;
    }

}

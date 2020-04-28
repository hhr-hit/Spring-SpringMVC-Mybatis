package com.hhr.service.Impl;

import com.hhr.dao.BagDao;

import com.hhr.entity.Bag;

import com.hhr.service.BagService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BagServiceImpl implements BagService {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入Service依赖
    @Autowired
    private BagDao bagDao;

    @Override
    public int add(Bag a) {
        //新建背包表记录
        return bagDao.insertBag(a.getAccountid());
    }

    @Override
    public Bag query(int accountid) {
        //查询背包表记录
        return bagDao.queryBag(accountid);
    }

    @Override
    public int delete(int accountid) {
        //空方法
        return 0;
    }

    @Override
    public int update(Bag u) {
        //更新背包表
        bagDao.updateBag(u.getAccountid(), u.getAllplace(), u.getUsedplace(), u.getAllspace(),
                u.getUsedspace(), u.getGoldcoin(), u.getWeaponname(), u.getWeaponscript(),
                u.getWeaponspace(), u.getArmorname(), u.getArmorscript(), u.getArmorspace(),
                u.getShoesname(), u.getShoesscript(), u.getShoesspace(), u.getHelmetname(),
                u.getHelmetscript(), u.getHelmetspace());
        return 0;
    }

}

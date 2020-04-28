package com.hhr.web;

import com.hhr.dao.GameDataDao;
import com.hhr.entity.Attribute;
import com.hhr.entity.Bag;
import com.hhr.entity.Function;
import com.hhr.entity.GameData;
import com.hhr.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class DataController { //数据同步的控制层

    private Logger logger = LoggerFactory.getLogger(this.getClass()); //日志

    @Autowired
    private AccountService accountService; //服务层
    @Autowired
    private UserService userService;
    @Autowired
    private AttributeService attributeService;
    @Autowired
    private BagService bagService;
    @Autowired
    private FunctionService functionService;
    @Autowired
    private GameDataDao gameDataDao;

    @RequestMapping("/dataSynA")
    @ResponseBody
    // 前端传来的json数据
    // 转换为Attribute对象
    public String dataSynA(@RequestBody Attribute attribute) { //玩家属性数据同步
        attributeService.update(attribute);
        return "SUCCESS";
    }

    @RequestMapping("/dataSynB")
    @ResponseBody
    // 前端传来的json数据
    // 转换为Bag对象
    public String dataSynB(@RequestBody Bag bag) { //玩家背包数据同步
        bagService.update(bag);
        return "SUCCESS";
    }

    @RequestMapping("/dataSynF")
    @ResponseBody
    // 前端传来的json数据
    // 转换为Function对象
    public String dataSynF(@RequestBody Function function) { //玩家功能数据同步
        functionService.update(function);
        return "SUCCESS";
    }

    @RequestMapping("/dataSyn")
    @ResponseBody
    // 前端传来的json数据
    // 转换为GameData对象
    public String dataSyn(@RequestBody GameData gamedata) { //玩家功能数据同步
        gameDataDao.updateGameData(gamedata.accountid,gamedata.all,gamedata.blank,
                gamedata.house,gamedata.trunk,gamedata.trap,gamedata.cutter,
                gamedata.woods,gamedata.woodsChange,gamedata.baiter,gamedata.baits,
                gamedata.baitsChange,gamedata.teeth,gamedata.hunter,gamedata.meats,
                gamedata.meatsChange,gamedata.furs,gamedata.fursChange,gamedata.baconer,
                gamedata.bacons,gamedata.baconsChange,gamedata.leatherer,gamedata.leathers,
                gamedata.leathersChange,gamedata.noWoods,gamedata.noBaits,gamedata.noBacons,
                gamedata.noMeats,gamedata.noFurs,gamedata.noLeathers,gamedata.noteeth,
                gamedata.cannotBacons1,gamedata.cannotBacons2,gamedata.cannotBaits,
                gamedata.cannotLeathers,gamedata.cutTime,gamedata.checkTime
        );
        /*int accountid,int all,int blank,
        int house,int trunk,int trap,int cutter,
        int woods,int woodsChange,int baiter,int baits,
        int baitsChange,int teeth,int hunter,int meats,
        int meatsChange,int furs,int fursChange,int baconer,
        int bacons,int baconsChange,int leatherer,int leathers,
        int leathersChange,int noWoods,int noBaits,int noBacons,
        int noMeats,int noFurs,int noLeathers,int noteeth,
        int cannotBacons1,int cannotBacons2,int cannotBaits,
        int cannotLeathers,int cutTime,int checkTime*/
        /*accountid,all,blank,house,trunk,trap,cutter,woods,woodsChange,baiter,baits,baitsChange,
        teeth,hunter,meats,meatsChange,furs,fursChange,baconer,bacons,baconsChange,leatherer,leathers,
        leathersChage,noWoods,noBaits,noBacons,noMeats,noFurs,noLeathers,noteeth,cannotBacons1,
        cannotBacons2,cannotBaits,cannotLeathers,cutTime,checkTime*/
        return "SUCCESS";
    }

}

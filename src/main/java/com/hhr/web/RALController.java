package com.hhr.web;

import com.hhr.entity.*;
import com.hhr.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class RALController { //注册、登陆的控制层

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
    private int accountid; //临时变量
    private String accountpwd;
    private String username;

    public @ResponseBody Attribute PostA(@RequestBody  Attribute attribute) throws Exception {
        //System.out.println(attribute); //返回数据
        return attribute;
    }

    public @ResponseBody Bag PostB(@RequestBody  Bag bag) throws Exception {
        //System.out.println(attribute); //返回数据
        return bag;
    }

    public @ResponseBody Function PostF(@RequestBody  Function function) throws Exception {
        //System.out.println(attribute); //返回数据
        return function;
    }

    @RequestMapping("/register")
    @ResponseBody
    // 前端传来的json数据
    // accountid，accountpwd，username
    // 转换为User对象
    public String register(@RequestBody User user) { //注册 //初始化5个表
        List<Account> l = accountService.query(user.getAccountid()); //查询数据库
        accountid = user.getAccountid();
        System.out.println(accountid);
        accountpwd = user.getAccountpwd();
        System.out.println(accountpwd);
        username = user.getUsername();
        System.out.println(username);

        if (l.size() == 0) { //未搜索到,可以注册
            user.setUserstate(0);
            Date date=new Date();
            Timestamp timeStamp = new Timestamp(date.getTime());
            user.setSignupdate(timeStamp);
            userService.add(user); //初始化user表
            Account account = new Account(accountid, accountpwd ,timeStamp);
            accountService.add(account); //初始化account表
            Attribute attribute = new Attribute(accountid);
            attributeService.add(attribute); //初始化attribute表
            Bag bag = new Bag(accountid);
            bagService.add(bag); //初始化bag表
            Function function = new Function(accountid);
            functionService.add(function); //初始化function表
            return "SUCCESS";
        }
        else {//账号已存在
            System.out.println("账号已存在");
            return "EXIST";
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    // 前端传来的json数据
    // accountid，accountpwd
    // 转换为Account对象
    public String login(@RequestBody Account account) { //登陆 //读取5个表
        List<Account> l = accountService.query(account.getAccountid());
        accountid = account.getAccountid();
        System.out.println(accountid);
        accountpwd = account.getAccountpwd();
        System.out.println(accountpwd);

        if (l.size() == 0) { //未搜索到
            System.out.println("没有此账号");
            return "NOTEXIST";
        } else if (l.get(0).getAccountpwd().equals(accountpwd)) {//密码匹配成功
            System.out.println("登陆成功");
            //暂不做 //修改用户在线状态
//            Attribute attribute = attributeService.query(accountid); //取得Attribute表的数据
//            Bag bag = bagService.query(accountid); //取得Bag表的数据
//            Function function = functionService.query(accountid); //取得Function表的数据
//            try {
//                PostA(attribute); //json格式传回数据
//                PostB(bag); //json格式传回数据
//                PostF(function); //json格式传回数据
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            //记录此时登陆的accountid
            return "SUCCESS";
        } else { //账户密码不匹配
            System.out.println("密码不正确");
            return "FAIL";
        }
    }
}

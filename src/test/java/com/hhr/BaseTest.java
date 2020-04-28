package com.hhr;

import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，
 * junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)

/**
 * 告诉junit spring配置文件在项目的位置
 */
@ContextConfiguration({ "classpath:spring/spring-dao.xml",
                        "classpath:spring/spring-service.xml" })
public class BaseTest {
    //空类，将本类作为父类
}

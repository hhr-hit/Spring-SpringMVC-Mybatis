package com.hhr.web;

import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
// 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class RALControllerTest extends AbstractContextControllerTests{

    private MockMvc mockMvc;
    private String registerUrl = "/register";
    private String loginUrl = "/login";

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).alwaysDo(print()).build();
    }

    @Test
    public void testSingup() throws Exception {
        //this.mockMvc.perform(get(registerUrl).param("accountid","123","abc","天涯")).andExpect(view().name("register"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountid",123);
        jsonObject.put("accountpwd","abc");
        jsonObject.put("username","天涯");
        MvcResult mvcResult= mockMvc.perform(
                MockMvcRequestBuilders.post(registerUrl).
                        content(jsonObject.toString()).
                        contentType(MediaType.APPLICATION_JSON)
        ).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).
                andReturn();
    }

    @Test
    public void testLogin() throws Exception {
        //this.mockMvc.perform(get(registerUrl).param("accountid","123","abc","天涯")).andExpect(view().name("register"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountid",123);
        jsonObject.put("accountpwd","abc");
        MvcResult mvcResult= mockMvc.perform(
                MockMvcRequestBuilders.post(loginUrl).
                        content(jsonObject.toString()).
                        contentType(MediaType.APPLICATION_JSON)
        ).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).
                andReturn();
    }
}

package com.hhr.web;

import net.sf.json.JSONObject;
import org.apache.ibatis.jdbc.Null;
import org.apache.taglibs.standard.lang.jstl.NullLiteral;
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
public class DataControllerTest extends AbstractContextControllerTests{

    private MockMvc mockMvc;
    private String synAUrl = "/dataSynA";
    private String synBUrl = "/dataSynB";
    private String synFUrl = "/dataSynF";
    private String synUrl = "/dataSyn";

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).alwaysDo(print()).build();
    }

    @Test
    public void testSynA() throws Exception {
        //this.mockMvc.perform(get(registerUrl).param("accountid","123","abc","天涯")).andExpect(view().name("register"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountid",123);
        jsonObject.put("level",1);
        jsonObject.put("title","NewGuy");
        jsonObject.put("exnow",0);
        jsonObject.put("exneed",0);
        jsonObject.put("vip",0);
        jsonObject.put("hp",0);
        jsonObject.put("atk",0);
        jsonObject.put("def",0);
        jsonObject.put("sp",0);
        MvcResult mvcResult= mockMvc.perform(
                MockMvcRequestBuilders.post(synAUrl).
                        content(jsonObject.toString()).
                        contentType(MediaType.APPLICATION_JSON)
        ).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).
                andReturn();
    }

    @Test
    public void testSynB() throws Exception {
        //this.mockMvc.perform(get(registerUrl).param("accountid","123","abc","天涯")).andExpect(view().name("register"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountid",123);
        jsonObject.put("Allplace",0);
        jsonObject.put("Usedplace",0);
        jsonObject.put("Allspace",0);
        jsonObject.put("Usedspace",0);
        jsonObject.put("Goldcoin",0);
        jsonObject.put("Weaponname","NewGuy");
        jsonObject.put("Weaponscript","NewGuy");
        jsonObject.put("Weaponspace",0);
        jsonObject.put("Armorname","NewGuy");
        jsonObject.put("Armorscript","NewGuy");
        jsonObject.put("Armorspace",0);
        jsonObject.put("Shoesname","NewGuy");
        jsonObject.put("Shoesscript","NewGuy");
        jsonObject.put("Shoesspace",0);
        jsonObject.put("Helmetname","NewGuy");
        jsonObject.put("Helmetscript","NewGuy");
        jsonObject.put("Helmetspace",0);
        MvcResult mvcResult= mockMvc.perform(
                MockMvcRequestBuilders.post(synBUrl).
                        content(jsonObject.toString()).
                        contentType(MediaType.APPLICATION_JSON)
        ).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).
                andReturn();
    }

    @Test
    public void testSynF() throws Exception {
        //this.mockMvc.perform(get(registerUrl).param("accountid","123","abc","天涯")).andExpect(view().name("register"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountid",123);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        MvcResult mvcResult= mockMvc.perform(
                MockMvcRequestBuilders.post(synFUrl).
                        content(jsonObject.toString()).
                        contentType(MediaType.APPLICATION_JSON)
        ).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).
                andReturn();
    }

    @Test
    public void testSyn() throws Exception {
        //this.mockMvc.perform(get(registerUrl).param("accountid","123","abc","天涯")).andExpect(view().name("register"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountid",123);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        jsonObject.put("title",0);
        MvcResult mvcResult= mockMvc.perform(
                MockMvcRequestBuilders.post(synFUrl).
                        content(jsonObject.toString()).
                        contentType(MediaType.APPLICATION_JSON)
        ).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).
                andReturn();
    }

}

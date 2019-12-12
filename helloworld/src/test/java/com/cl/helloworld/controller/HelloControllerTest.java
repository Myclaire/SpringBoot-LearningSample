package com.cl.helloworld.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Description test for HelloController
 * @Author Chenglong
 * @Creat At 2019-12-12 11:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void before(){
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    /**
     * success to get data of string
     */
    @Test
    public void success_get_string() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/hello/string"))
                .andExpect(MockMvcResultMatchers.jsonPath("errNo").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("errMsg").value("success"))
                .andExpect(MockMvcResultMatchers.jsonPath("data").value("成龙"))
                .andDo(MockMvcResultHandlers.print());
    }

    /**
     * success to get data of object
     */
    @Test
    public void success_get_object() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/hello/string"))
                .andExpect(MockMvcResultMatchers.jsonPath("errNo").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("errMsg").value("success"))
                .andExpect(MockMvcResultMatchers.jsonPath("data").isNotEmpty())
                .andDo(MockMvcResultHandlers.print());
    }

    /**
     * success to get data of map
     */
    @Test
    public void success_get_map() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/hello/string"))
                .andExpect(MockMvcResultMatchers.jsonPath("errNo").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("errMsg").value("success"))
                .andExpect(MockMvcResultMatchers.jsonPath("data").isNotEmpty())
                .andDo(MockMvcResultHandlers.print());
    }
}
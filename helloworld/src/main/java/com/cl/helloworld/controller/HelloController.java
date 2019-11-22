package com.cl.helloworld.controller;

import com.cl.common.result.DataResponse;
import com.cl.helloworld.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DataResponse response;

    /**
     * 返回字符串
     */
    @RequestMapping("/string")
    public DataResponse string(){
        String name = "成龙";
        return new DataResponse(name);
    }

    /**
     * 返回对象
     */
    @RequestMapping("/object")
    public DataResponse object(){
        Person person = new Person("成龙", "男", 18);
        return new DataResponse(person);
    }

    /**
     * 返回map
     */
    @RequestMapping("/map")
    public DataResponse map(){
        Map<String, Object> map = new HashMap<>();
        map.put("school", "四川大学");
        map.put("diploma", "本科");
        map.put("info", new Person("成龙", "男", 18));
        return response.success(map);
    }
}

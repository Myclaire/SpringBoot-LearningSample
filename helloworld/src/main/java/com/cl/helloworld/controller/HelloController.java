package com.cl.helloworld.controller;

import com.cl.common.result.DataResponse;
import com.cl.common.result.ResultUtil;
import com.cl.helloworld.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * 返回字符串
     */
    @GetMapping("/string")
    public DataResponse string(){
        String name = "成龙";
        return ResultUtil.success(name);
    }

    /**
     * 返回对象
     */
    @GetMapping("/object")
    public DataResponse object(){
        Person person = new Person("成龙", "男", 18);
        return ResultUtil.success(person);
    }

    /**
     * 返回map
     */
    @GetMapping("/map")
    public DataResponse map(){
        Map<String, Object> map = new HashMap<>();
        map.put("school", "四川大学");
        map.put("diploma", "本科");
        map.put("info", new Person("成龙", "男", 18));
        return ResultUtil.success(map);
    }
}
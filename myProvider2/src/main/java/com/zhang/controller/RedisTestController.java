package com.zhang.controller;

import com.zhang.entity.User;
import com.zhang.service.impl.HelloService;
import com.zhang.untils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("redis")
public class RedisTestController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/get")
    public String redistest(){
        List<User> users = helloService.helloTest();
        RedisUtil.set("1",users.toString());
        return RedisUtil.get("1");
    }

}

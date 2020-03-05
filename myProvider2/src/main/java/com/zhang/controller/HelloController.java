package com.zhang.controller;


import com.zhang.entity.User;
import com.zhang.service.impl.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/find")
    @ResponseBody
    public List<User> hello(){
        return helloService.helloTest();
    }
}
package com.zhang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTest {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String hello(){return "welcome to springcloud! server port:"+port;  }
}

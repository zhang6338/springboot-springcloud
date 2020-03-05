package com.zhang.controller;

import com.zhang.service.FeignRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss")
public class FeignController {

    @Autowired
    FeignRemoteService feignRemoteService;

    @GetMapping(value = "/getHello")
    public String getHello() {
        return feignRemoteService.hello();
    }
    @GetMapping(value = "/getfind")
    public String getFind() {
        return feignRemoteService.find();
    }

}

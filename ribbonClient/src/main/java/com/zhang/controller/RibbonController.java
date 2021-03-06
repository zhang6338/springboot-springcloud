package com.zhang.controller;

import com.zhang.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/getHello")
    public String getHello() {
        return ribbonService.getHello();
    }

}

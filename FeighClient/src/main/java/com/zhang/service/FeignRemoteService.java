package com.zhang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider2")
public interface FeignRemoteService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String find();

}

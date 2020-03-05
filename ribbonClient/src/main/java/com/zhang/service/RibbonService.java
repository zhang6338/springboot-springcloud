package com.zhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String getHello() {
        return restTemplate.getForObject("http://provider2/find",String.class);
    }

}

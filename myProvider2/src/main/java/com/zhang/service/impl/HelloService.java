package com.zhang.service.impl;


import com.zhang.entity.User;
import com.zhang.mapper.UserMapper;
import com.zhang.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HelloService implements IHelloService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> helloTest() {

        return userMapper.selectById() ;
    }
}

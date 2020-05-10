package com.ly.spring.service.impl;

import com.ly.spring.entity.User;
import com.ly.spring.mapper.UserMapper;
import com.ly.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String hello() {
        return "hello service!";
    }

    @Override
    public String test() {

        User user = new User("aa", "a123456", 0);
        userMapper.insert(user);
        return "success";
    }
}

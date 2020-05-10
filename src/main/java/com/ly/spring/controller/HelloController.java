package com.ly.spring.controller;

import com.ly.spring.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @GetMapping("/controller/hello")
    public String helloController(){
        return "hello controller!";
    }

    @GetMapping("/service/hello")
    public String helloService(){
        return helloService.test();
    }


}

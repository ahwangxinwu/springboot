package com.wxw.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @RequestMapping("/hello")
    public String hello(){
        return "helloword";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "热部署测试";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return "热部署测试3";
    }

    @RequestMapping("/hello4")
    public String hello4(){
        return "热部署测试4";
    }

    @RequestMapping("/hello5")
    public String hello5(){
        return "热部署测试5";
    }
}

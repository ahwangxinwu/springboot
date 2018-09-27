package com.wxw.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @RequestMapping("/hello")
    public String hello(){
        return "helloword";
    }


    public static void main(String[] args) {
        System.out.println("结果是："+HelloWord.foo(30));
    }

    /**
     * 递归算法实现
     */
    public static int foo(int i){
        if(i<=0){
            return 0;
        }
        else if(i>0 && i<=2){
            return 1;
        }
        return foo(i-1) + foo(i-2);
    }


}

package com.zking.eurekaconsumer.controller;

import com.zking.eurekaconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class consumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public  String test(String name){
        return  helloService.test(name);
    }
}

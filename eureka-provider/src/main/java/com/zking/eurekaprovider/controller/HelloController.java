package com.zking.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private  int port;

    @Value("${config.hello}")
    private String msg;

    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return "生产者  "+port+",你好 ！ "+name+"，msg="+msg;
    }

}

package com.zking.eurekaconsumer.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String test(String name) {
        return "系统繁忙，请稍后重试 ";
    }
}

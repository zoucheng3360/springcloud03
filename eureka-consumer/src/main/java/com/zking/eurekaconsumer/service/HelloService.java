package com.zking.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-provider",fallback = HelloServiceFallback.class)
public interface HelloService {


    @RequestMapping("/hello")
    String   test(@RequestParam("name")String name);

}

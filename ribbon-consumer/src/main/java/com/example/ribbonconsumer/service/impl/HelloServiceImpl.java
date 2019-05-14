package com.example.ribbonconsumer.service.impl;

import com.example.ribbonconsumer.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public String helloService() {
        String result = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        return result;
    }


    public String fallback() {
        System.out.println();
        return "fail";
    }

}

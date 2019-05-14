package com.fj.feign.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("HELLO-SERVICE")
public interface HelloService {

   @RequestMapping("/hello")
   String helloService();


   @RequestMapping(value = "/bind", method = RequestMethod.GET)
   String bind(@RequestParam("name")  String name);


}

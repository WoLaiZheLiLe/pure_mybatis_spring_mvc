package com.fj.feign.feign.consume;

import com.fj.feign.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        String result = helloService.helloService();
        return result;
    }


    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String bind(@RequestParam("name") String name) {
        String result = helloService.bind(name);
        return result;
    }

}

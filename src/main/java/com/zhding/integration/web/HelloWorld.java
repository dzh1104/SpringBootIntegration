package com.zhding.integration.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController == @Controller + @ResponseBody
@RestController
public class HelloWorld {

    // @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    @GetMapping("/helloworld")
    public String sayHelloWorld() {
        return "Hello World ! run with JRebel!";
    }
}

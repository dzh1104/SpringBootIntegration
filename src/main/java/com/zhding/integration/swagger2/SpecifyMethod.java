package com.zhding.integration.swagger2;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecifyMethod {
    // 需要指定访问的方式，否则会导致其中一个影响就是swagger2显示所有的方法
    // @GetMapping("/specifyMethod")
    @RequestMapping(value = "/specifyMethod")
    @ApiOperation(value = "指明请求方法", notes = "需要指明接口的请求方式，否则会swagger2会列出所有的方式")
    public String specifyMethod() {

        return "Hello Spring Boot! To be starter!";
    }
}

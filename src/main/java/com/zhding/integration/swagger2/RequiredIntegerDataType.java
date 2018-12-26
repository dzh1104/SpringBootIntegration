package com.zhding.integration.swagger2;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequiredIntegerDataType {
    @ApiOperation(value = "必填int类型的参数情况", notes = "返回用户的输入")
    // 字段（id） 描述（用户ID）参数类型 是否必填 数据类型
    // dataType 应该要为 String，因为在swagger2页面中的输入框 拿到的是 字符串类型的，不修改为 String，页面中的输入框会报错
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer")

    @RequestMapping("/requiredIntegerDataType/{id}")
    public String testSwagger2 (@PathVariable String id) {
        return id;
    }
}

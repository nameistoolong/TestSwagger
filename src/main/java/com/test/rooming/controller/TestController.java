package com.test.rooming.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@Api("userController相关api")
public class TestController {

    @ApiOperation("获取用户信息")
    @GetMapping("tt")
    public String testMethod(@RequestParam("msg") String msg) {
        return msg;
    }
}

package top.meethigher.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试模块")
@RequestMapping("/test")
public class TestController {

    @GetMapping
    @ApiOperation("get")
    public String get() {
        return "get";
    }

    @PostMapping
    @ApiOperation("post")
    public String post() {
        return "post";
    }
}

package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class ParamController {

    //通过控制器的形参获取形参，请求参数名需与形参一致
    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false) String username,
            String password,
            String[] hobby,
            @RequestHeader("Host") String host
    ) {
        System.out.println("username:" + username + ",password:" + password +
                ",hobby:" + Arrays.toString(hobby));
        System.out.println("host:"+host);
        return "success";
    }
}

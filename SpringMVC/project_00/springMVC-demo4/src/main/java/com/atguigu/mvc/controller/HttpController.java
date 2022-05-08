package com.atguigu.mvc.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody：" +requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("请求头"+requestEntity.getHeaders());
        System.out.println("请求体"+requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }


}

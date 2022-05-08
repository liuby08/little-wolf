package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {

    @RequestMapping(
            value ={ "/**/testSuccess","test"}
            )
    public String toTest(){
        return "success";
    }

    @RequestMapping(
            value = {"/testSuccess","test"}
            , method = {RequestMethod.GET,RequestMethod.POST}
            , params = {"username","password=123456"}
            , headers = {"host=localhost:8080"}
            )
    public String toSuccess(){
        return "success";
    }

    @RequestMapping(value = "/test/{id}/{admin}")
    public String toTestSuccess(@PathVariable("id") int id,@PathVariable("admin") String admin){
        System.out.println("id:"+id+",admin:"+admin);
        return "success";
    }
}

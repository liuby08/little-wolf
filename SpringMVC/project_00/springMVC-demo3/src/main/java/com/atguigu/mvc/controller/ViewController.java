package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

//    @RequestMapping("/test_view")
//    public String test_view(){
//        return "test_view";
//    }

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }
    @RequestMapping("/testRedirect")
    public String testResdirect(){
        return "redirect:/testThymeleafView";
    }
}

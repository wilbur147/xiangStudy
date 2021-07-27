package com.xiang.learn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String helloIndex(){
        return "Hello Xiang!!!";
    }

}

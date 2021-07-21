package com.xiang.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Xiang
 * @Description
 **/
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String helloIndex(){
        return "Hello World";
    }

}

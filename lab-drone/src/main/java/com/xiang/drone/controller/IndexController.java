package com.xiang.drone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilbur
 * @Description
 * @create 2021-07-19 15:51
 **/
@RestController
public class IndexController {

    @RequestMapping("/")
    public String Index(){
        return "Hello World！！！！";
    }

}

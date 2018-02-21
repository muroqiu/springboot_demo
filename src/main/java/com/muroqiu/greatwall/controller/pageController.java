package com.muroqiu.greatwall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String page(){
        return "index";
    }
}
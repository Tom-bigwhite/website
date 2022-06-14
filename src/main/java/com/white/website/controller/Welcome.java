package com.white.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author White
 * @description 欢迎页
 * @date 2022/6/14 17:03
 */

@RestController
@RequestMapping("/welcome")
public class Welcome {

    @RequestMapping
    public String welcome(){
        String welcomeStr = "欢迎来到我的网站！";
        System.out.println(welcomeStr);
        return welcomeStr;
    }
}

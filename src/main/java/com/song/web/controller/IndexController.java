package com.song.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Song on 2017/11/6.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"","/","/index"})
    public String index(){
        return "index";
    }
}

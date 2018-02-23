package com.hdliu.wxems.controller;

import com.hdliu.wxems.util.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value={"/","/index","/index.*"})
    public String index() throws Exception{
        System.out.println(SecurityUtils.getUser());
        return "index";
    }

}


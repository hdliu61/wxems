package com.hdliu.wxems.controller;

import com.hdliu.wxems.entity.TUser;
import com.hdliu.wxems.service.UserService;
import com.hdliu.wxems.util.SecurityUtils;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value={"/","/index","/index.*"})
    public String index(Model model, HttpSession session){
        Object TUserObj=session.getAttribute("tuser");
        TUser tUser=null;
        if (TUserObj==null){
            UserDetails user=SecurityUtils.getUser();
            tUser= userService.findUserBySn(user.getUsername());
        }else {
            tUser=(TUser)TUserObj;
        }
        model.addAttribute("user",tUser);
        return "index";
    }

}


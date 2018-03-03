package com.hdliu.wxems.util;

import com.hdliu.wxems.entity.TUser;
import com.hdliu.wxems.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;

@Component
public class SecurityUtils {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public static UserDetails getUser(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public static Collection<? extends GrantedAuthority> getAuthority(){
        return getUser().getAuthorities();
    }

    public static TUser getTUser(){
        HttpSession session =  ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        Object TUserObj=session.getAttribute("tuser");
        TUser tUser=null;
        if (TUserObj==null){
            tUser= null;
        }else {
            tUser=(TUser)TUserObj;
        }
        return  tUser;
    }

}

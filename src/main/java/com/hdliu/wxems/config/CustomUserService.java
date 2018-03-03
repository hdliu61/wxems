package com.hdliu.wxems.config;

import com.hdliu.wxems.entity.TUser;
import com.hdliu.wxems.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
/**
 * 自定义UserDetailsService 接口
 */
public class CustomUserService implements UserDetailsService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * 重写loadUserByUsername 方法获得 userdetails 类型用户
     * @param username
     * @return
     */
    @Override
    public UserDetails loadUserByUsername(String username) {
        logger.info(username+"尝试登录");

        TUser user=userService.findUserBySn(username);
        if(user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        /*用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。*/
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

//        for(SysRole role:user.getRoles())
//        {
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//            System.out.println(role.getName());
//        }

        return new org.springframework.security.core.userdetails.User(user.getSn(),
                user.getPassword(), authorities);
    }
}
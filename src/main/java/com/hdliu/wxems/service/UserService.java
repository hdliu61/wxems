package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TUser;

public interface UserService {
    /**
     * 通过id找用户
     * @return
     */
    TUser findUserById(int id);

    /**
     * 通过学号/工号找用户
     * @return
     */
    TUser findUserBySn(String sn);
}

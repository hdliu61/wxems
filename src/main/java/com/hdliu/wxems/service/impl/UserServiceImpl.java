package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TUserMapper;
import com.hdliu.wxems.entity.TUser;
import com.hdliu.wxems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper mapper;

    @Override
    public TUser findUserById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public TUser findUserBySn(String sn) {
        return mapper.selectBySn(sn);
    }
}

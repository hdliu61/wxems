package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TUser;
import com.hdliu.wxems.entity.TUserExample;

import java.util.List;

public interface UserService {

    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Integer id);

    TUser selectBySn(String sn);

    int updateByExampleSelective(TUser record,TUserExample example);

    int updateByExample(TUser record,TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser findUserById(int id);

    TUser findUserBySn(String sn);
}

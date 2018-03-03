package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TUserMapper;
import com.hdliu.wxems.entity.TUser;
import com.hdliu.wxems.entity.TUserExample;
import com.hdliu.wxems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper mapper;

    @Override
    public long countByExample(TUserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TUserExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TUser record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TUser record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TUser> selectByExample(TUserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public TUser selectBySn(String sn) {
        return mapper.selectBySn(sn);
    }

    @Override
    public int updateByExampleSelective(TUser record, TUserExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TUser record, TUserExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public TUser findUserById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public TUser findUserBySn(String sn) {
        return mapper.selectBySn(sn);
    }
}

package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TThreadMapper;
import com.hdliu.wxems.entity.TThread;
import com.hdliu.wxems.entity.TThreadExample;

import java.util.List;

import com.hdliu.wxems.service.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;

public class ThreadServiceImpl implements ThreadService {

    @Autowired
    private TThreadMapper mapper;

    @Override
    public long countByExample(TThreadExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TThreadExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TThread record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TThread record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TThread> selectByExampleWithBLOBs(TThreadExample example) {
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<TThread> selectByExample(TThreadExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TThread selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TThread record, TThreadExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(TThread record, TThreadExample example) {
        return mapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(TThread record, TThreadExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TThread record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TThread record) {
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(TThread record) {
        return mapper.updateByPrimaryKey(record);
    }
}
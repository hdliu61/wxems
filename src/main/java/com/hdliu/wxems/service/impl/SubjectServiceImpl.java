package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TSubjectMapper;
import com.hdliu.wxems.entity.TSubject;
import com.hdliu.wxems.entity.TSubjectExample;

import java.util.List;

import com.hdliu.wxems.service.SubjectService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private TSubjectMapper mapper;

    @Override
    public long countByExample(TSubjectExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TSubjectExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TSubject record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TSubject record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TSubject> selectByExample(TSubjectExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TSubject selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TSubject record, TSubjectExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TSubject record, TSubjectExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TSubject record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TSubject record) {
        return mapper.updateByPrimaryKey(record);
    }
}
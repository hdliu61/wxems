package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TCollegeMapper;
import com.hdliu.wxems.entity.TCollege;
import com.hdliu.wxems.entity.TCollegeExample;
import com.hdliu.wxems.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private TCollegeMapper mapper;

    @Override
    public long countByExample(TCollegeExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TCollegeExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TCollege record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TCollege record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TCollege> selectByExample(TCollegeExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TCollege selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TCollege record, TCollegeExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCollege record, TCollegeExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCollege record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCollege record) {
        return mapper.updateByPrimaryKey(record);
    }
}
package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TCollegeSubjectMapper;
import com.hdliu.wxems.entity.TCollegeSubject;
import com.hdliu.wxems.entity.TCollegeSubjectExample;
import java.util.List;
import com.hdliu.wxems.service.CollegeSubjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class CollegeSubjectServiceImpl implements CollegeSubjectService {

    @Autowired
    private TCollegeSubjectMapper mapper;

    @Override
    public long countByExample(TCollegeSubjectExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TCollegeSubjectExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TCollegeSubject record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TCollegeSubject record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TCollegeSubject> selectByExample(TCollegeSubjectExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TCollegeSubject selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TCollegeSubject record, TCollegeSubjectExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCollegeSubject record, TCollegeSubjectExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCollegeSubject record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCollegeSubject record) {
        return mapper.updateByPrimaryKey(record);
    }
}
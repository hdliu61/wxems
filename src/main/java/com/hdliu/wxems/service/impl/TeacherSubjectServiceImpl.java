package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TTeacherSubjectMapper;
import com.hdliu.wxems.entity.TTeacherSubject;
import com.hdliu.wxems.entity.TTeacherSubjectExample;
import java.util.List;
import com.hdliu.wxems.service.TeacherSubjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherSubjectServiceImpl implements TeacherSubjectService {

    @Autowired
    private TTeacherSubjectMapper mapper;

    @Override
    public long countByExample(TTeacherSubjectExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TTeacherSubjectExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TTeacherSubject record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TTeacherSubject record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TTeacherSubject> selectByExample(TTeacherSubjectExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TTeacherSubject selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TTeacherSubject record, TTeacherSubjectExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TTeacherSubject record, TTeacherSubjectExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TTeacherSubject record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TTeacherSubject record) {
        return mapper.updateByPrimaryKey(record);
    }
}
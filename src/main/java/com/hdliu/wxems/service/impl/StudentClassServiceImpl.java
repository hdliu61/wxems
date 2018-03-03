package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TStudentClassMapper;
import com.hdliu.wxems.entity.TStudentClass;
import com.hdliu.wxems.entity.TStudentClassExample;
import java.util.List;
import com.hdliu.wxems.service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentClassServiceImpl implements StudentClassService {

    @Autowired
    private TStudentClassMapper mapper;

    @Override
    public long countByExample(TStudentClassExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TStudentClassExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TStudentClass record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TStudentClass record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TStudentClass> selectByExample(TStudentClassExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TStudentClass selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TStudentClass record, TStudentClassExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TStudentClass record, TStudentClassExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TStudentClass record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TStudentClass record) {
        return mapper.updateByPrimaryKey(record);
    }
}
package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TTeacherClassMapper;
import com.hdliu.wxems.entity.TTeacherClass;
import com.hdliu.wxems.entity.TTeacherClassExample;
import com.hdliu.wxems.entity.TTeacherClassWithBLOBs;
import java.util.List;
import com.hdliu.wxems.service.TeacherClassService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherClassServiceImpl implements TeacherClassService {

    @Autowired
    private TTeacherClassMapper mapper;

    @Override
    public long countByExample(TTeacherClassExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TTeacherClassExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TTeacherClassWithBLOBs record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TTeacherClassWithBLOBs record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TTeacherClassWithBLOBs> selectByExampleWithBLOBs(TTeacherClassExample example) {
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<TTeacherClass> selectByExample(TTeacherClassExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TTeacherClassWithBLOBs selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TTeacherClassWithBLOBs record, TTeacherClassExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(TTeacherClassWithBLOBs record, TTeacherClassExample example) {
        return mapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(TTeacherClass record, TTeacherClassExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TTeacherClassWithBLOBs record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TTeacherClassWithBLOBs record) {
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(TTeacherClass record) {
        return mapper.updateByPrimaryKey(record);
    }
}
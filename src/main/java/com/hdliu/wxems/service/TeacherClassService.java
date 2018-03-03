package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TTeacherClass;
import com.hdliu.wxems.entity.TTeacherClassExample;
import com.hdliu.wxems.entity.TTeacherClassWithBLOBs;

import java.util.List;

public interface TeacherClassService {
    long countByExample(TTeacherClassExample example);

    int deleteByExample(TTeacherClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeacherClassWithBLOBs record);

    int insertSelective(TTeacherClassWithBLOBs record);

    List<TTeacherClassWithBLOBs> selectByExampleWithBLOBs(TTeacherClassExample example);

    List<TTeacherClass> selectByExample(TTeacherClassExample example);

    TTeacherClassWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TTeacherClassWithBLOBs record, TTeacherClassExample example);

    int updateByExampleWithBLOBs(TTeacherClassWithBLOBs record, TTeacherClassExample example);

    int updateByExample(TTeacherClass record, TTeacherClassExample example);

    int updateByPrimaryKeySelective(TTeacherClassWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TTeacherClassWithBLOBs record);

    int updateByPrimaryKey(TTeacherClass record);
}
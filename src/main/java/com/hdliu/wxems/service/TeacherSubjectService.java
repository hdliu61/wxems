package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TTeacherSubject;
import com.hdliu.wxems.entity.TTeacherSubjectExample;
import java.util.List;

public interface TeacherSubjectService {
    long countByExample(TTeacherSubjectExample example);

    int deleteByExample(TTeacherSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeacherSubject record);

    int insertSelective(TTeacherSubject record);

    List<TTeacherSubject> selectByExample(TTeacherSubjectExample example);

    TTeacherSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TTeacherSubject record, TTeacherSubjectExample example);

    int updateByExample(TTeacherSubject record, TTeacherSubjectExample example);

    int updateByPrimaryKeySelective(TTeacherSubject record);

    int updateByPrimaryKey(TTeacherSubject record);
}
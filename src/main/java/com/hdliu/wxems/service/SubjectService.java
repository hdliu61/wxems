package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TSubject;
import com.hdliu.wxems.entity.TSubjectExample;

import java.util.List;

public interface SubjectService {
    long countByExample(TSubjectExample example);

    int deleteByExample(TSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSubject record);

    int insertSelective(TSubject record);

    List<TSubject> selectByExample(TSubjectExample example);

    TSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TSubject record, TSubjectExample example);

    int updateByExample(TSubject record, TSubjectExample example);

    int updateByPrimaryKeySelective(TSubject record);

    int updateByPrimaryKey(TSubject record);
}
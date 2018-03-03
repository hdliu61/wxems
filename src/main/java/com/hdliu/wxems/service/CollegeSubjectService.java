package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TCollegeSubject;
import com.hdliu.wxems.entity.TCollegeSubjectExample;
import java.util.List;

public interface CollegeSubjectService {
    long countByExample(TCollegeSubjectExample example);

    int deleteByExample(TCollegeSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollegeSubject record);

    int insertSelective(TCollegeSubject record);

    List<TCollegeSubject> selectByExample(TCollegeSubjectExample example);

    TCollegeSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TCollegeSubject record, TCollegeSubjectExample example);

    int updateByExample(TCollegeSubject record, TCollegeSubjectExample example);

    int updateByPrimaryKeySelective(TCollegeSubject record);

    int updateByPrimaryKey(TCollegeSubject record);
}
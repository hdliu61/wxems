package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TCollege;
import com.hdliu.wxems.entity.TCollegeExample;

import java.util.List;


public interface CollegeService {
    long countByExample(TCollegeExample example);

    int deleteByExample(TCollegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollege record);

    int insertSelective(TCollege record);

    List<TCollege> selectByExample(TCollegeExample example);

    TCollege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TCollege record, TCollegeExample example);

    int updateByExample(TCollege record, TCollegeExample example);

    int updateByPrimaryKeySelective(TCollege record);

    int updateByPrimaryKey(TCollege record);
}
package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TCollegeSubject;
import com.hdliu.wxems.entity.TCollegeSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCollegeSubjectMapper {
    long countByExample(TCollegeSubjectExample example);

    int deleteByExample(TCollegeSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollegeSubject record);

    int insertSelective(TCollegeSubject record);

    List<TCollegeSubject> selectByExample(TCollegeSubjectExample example);

    TCollegeSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCollegeSubject record, @Param("example") TCollegeSubjectExample example);

    int updateByExample(@Param("record") TCollegeSubject record, @Param("example") TCollegeSubjectExample example);

    int updateByPrimaryKeySelective(TCollegeSubject record);

    int updateByPrimaryKey(TCollegeSubject record);
}
package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TTeacherSubject;
import com.hdliu.wxems.entity.TTeacherSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeacherSubjectMapper {
    long countByExample(TTeacherSubjectExample example);

    int deleteByExample(TTeacherSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeacherSubject record);

    int insertSelective(TTeacherSubject record);

    List<TTeacherSubject> selectByExample(TTeacherSubjectExample example);

    TTeacherSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeacherSubject record, @Param("example") TTeacherSubjectExample example);

    int updateByExample(@Param("record") TTeacherSubject record, @Param("example") TTeacherSubjectExample example);

    int updateByPrimaryKeySelective(TTeacherSubject record);

    int updateByPrimaryKey(TTeacherSubject record);
}
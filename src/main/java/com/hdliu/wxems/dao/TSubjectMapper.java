package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TSubject;
import com.hdliu.wxems.entity.TSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSubjectMapper {
    long countByExample(TSubjectExample example);

    int deleteByExample(TSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSubject record);

    int insertSelective(TSubject record);

    List<TSubject> selectByExample(TSubjectExample example);

    TSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSubject record, @Param("example") TSubjectExample example);

    int updateByExample(@Param("record") TSubject record, @Param("example") TSubjectExample example);

    int updateByPrimaryKeySelective(TSubject record);

    int updateByPrimaryKey(TSubject record);
}
package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TStudentClass;
import com.hdliu.wxems.entity.TStudentClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStudentClassMapper {
    long countByExample(TStudentClassExample example);

    int deleteByExample(TStudentClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStudentClass record);

    int insertSelective(TStudentClass record);

    List<TStudentClass> selectByExample(TStudentClassExample example);

    TStudentClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStudentClass record, @Param("example") TStudentClassExample example);

    int updateByExample(@Param("record") TStudentClass record, @Param("example") TStudentClassExample example);

    int updateByPrimaryKeySelective(TStudentClass record);

    int updateByPrimaryKey(TStudentClass record);
}
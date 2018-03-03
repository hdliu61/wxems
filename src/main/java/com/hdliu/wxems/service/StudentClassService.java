package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TStudentClass;
import com.hdliu.wxems.entity.TStudentClassExample;
import java.util.List;

public interface StudentClassService {
    long countByExample(TStudentClassExample example);

    int deleteByExample(TStudentClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStudentClass record);

    int insertSelective(TStudentClass record);

    List<TStudentClass> selectByExample(TStudentClassExample example);

    TStudentClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TStudentClass record, TStudentClassExample example);

    int updateByExample(TStudentClass record, TStudentClassExample example);

    int updateByPrimaryKeySelective(TStudentClass record);

    int updateByPrimaryKey(TStudentClass record);
}
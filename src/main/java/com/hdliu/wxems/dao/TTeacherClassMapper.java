package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TTeacherClass;
import com.hdliu.wxems.entity.TTeacherClassExample;
import com.hdliu.wxems.entity.TTeacherClassWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeacherClassMapper {
    long countByExample(TTeacherClassExample example);

    int deleteByExample(TTeacherClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeacherClassWithBLOBs record);

    int insertSelective(TTeacherClassWithBLOBs record);

    List<TTeacherClassWithBLOBs> selectByExampleWithBLOBs(TTeacherClassExample example);

    List<TTeacherClass> selectByExample(TTeacherClassExample example);

    TTeacherClassWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeacherClassWithBLOBs record, @Param("example") TTeacherClassExample example);

    int updateByExampleWithBLOBs(@Param("record") TTeacherClassWithBLOBs record, @Param("example") TTeacherClassExample example);

    int updateByExample(@Param("record") TTeacherClass record, @Param("example") TTeacherClassExample example);

    int updateByPrimaryKeySelective(TTeacherClassWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TTeacherClassWithBLOBs record);

    int updateByPrimaryKey(TTeacherClass record);
}
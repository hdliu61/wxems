package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TThread;
import com.hdliu.wxems.entity.TThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TThreadMapper {
    long countByExample(TThreadExample example);

    int deleteByExample(TThreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TThread record);

    int insertSelective(TThread record);

    List<TThread> selectByExampleWithBLOBs(TThreadExample example);

    List<TThread> selectByExample(TThreadExample example);

    TThread selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TThread record, @Param("example") TThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") TThread record, @Param("example") TThreadExample example);

    int updateByExample(@Param("record") TThread record, @Param("example") TThreadExample example);

    int updateByPrimaryKeySelective(TThread record);

    int updateByPrimaryKeyWithBLOBs(TThread record);

    int updateByPrimaryKey(TThread record);
}
package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TThread;
import com.hdliu.wxems.entity.TThreadExample;
import java.util.List;

public interface ThreadService {
    long countByExample(TThreadExample example);

    int deleteByExample(TThreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TThread record);

    int insertSelective(TThread record);

    List<TThread> selectByExampleWithBLOBs(TThreadExample example);

    List<TThread> selectByExample(TThreadExample example);

    TThread selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TThread record, TThreadExample example);

    int updateByExampleWithBLOBs(TThread record, TThreadExample example);

    int updateByExample(TThread record, TThreadExample example);

    int updateByPrimaryKeySelective(TThread record);

    int updateByPrimaryKeyWithBLOBs(TThread record);

    int updateByPrimaryKey(TThread record);
}
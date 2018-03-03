package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TTerm;
import com.hdliu.wxems.entity.TTermExample;
import java.util.List;

public interface TermService {
    long countByExample(TTermExample example);

    int deleteByExample(TTermExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTerm record);

    int insertSelective(TTerm record);

    List<TTerm> selectByExample(TTermExample example);

    TTerm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TTerm record, TTermExample example);

    int updateByExample(TTerm record, TTermExample example);

    int updateByPrimaryKeySelective(TTerm record);

    int updateByPrimaryKey(TTerm record);
}
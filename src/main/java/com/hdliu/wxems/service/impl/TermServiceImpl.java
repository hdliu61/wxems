package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TTermMapper;
import com.hdliu.wxems.entity.TTerm;
import com.hdliu.wxems.entity.TTermExample;
import java.util.List;
import com.hdliu.wxems.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;

public class TermServiceImpl implements TermService {

    @Autowired
    private TTermMapper mapper;

    @Override
    public long countByExample(TTermExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TTermExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TTerm record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TTerm record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TTerm> selectByExample(TTermExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TTerm selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TTerm record, TTermExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TTerm record, TTermExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TTerm record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TTerm record) {
        return mapper.updateByPrimaryKey(record);
    }
}
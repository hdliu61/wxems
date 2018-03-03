package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.THomeworkScoreMapper;
import com.hdliu.wxems.entity.THomeworkScore;
import com.hdliu.wxems.entity.THomeworkScoreExample;

import java.util.List;

import com.hdliu.wxems.service.HomeworkScoreService;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeworkScoreServiceImpl implements HomeworkScoreService {

    @Autowired
    private THomeworkScoreMapper mapper;

    @Override
    public long countByExample(THomeworkScoreExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(THomeworkScoreExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(THomeworkScore record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(THomeworkScore record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<THomeworkScore> selectByExample(THomeworkScoreExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public THomeworkScore selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(THomeworkScore record, THomeworkScoreExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(THomeworkScore record, THomeworkScoreExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(THomeworkScore record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(THomeworkScore record) {
        return mapper.updateByPrimaryKey(record);
    }
}
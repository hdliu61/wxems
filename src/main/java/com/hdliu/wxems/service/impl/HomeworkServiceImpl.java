package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.THomeworkMapper;
import com.hdliu.wxems.entity.THomework;
import com.hdliu.wxems.entity.THomeworkExample;
import java.util.List;
import com.hdliu.wxems.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeworkServiceImpl implements HomeworkService {

    @Autowired
    private THomeworkMapper mapper;

    @Override
    public long countByExample(THomeworkExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(THomeworkExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(THomework record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(THomework record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<THomework> selectByExample(THomeworkExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public THomework selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(THomework record, THomeworkExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(THomework record, THomeworkExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(THomework record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(THomework record) {
        return mapper.updateByPrimaryKey(record);
    }
}
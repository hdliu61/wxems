package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TForumMapper;
import com.hdliu.wxems.entity.TForum;
import com.hdliu.wxems.entity.TForumExample;
import java.util.List;
import com.hdliu.wxems.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;

public class ForumServiceImpl implements ForumService {

    @Autowired
    private TForumMapper mapper;

    @Override
    public long countByExample(TForumExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TForumExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TForum record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TForum record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TForum> selectByExample(TForumExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TForum selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TForum record, TForumExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TForum record, TForumExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TForum record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TForum record) {
        return mapper.updateByPrimaryKey(record);
    }
}
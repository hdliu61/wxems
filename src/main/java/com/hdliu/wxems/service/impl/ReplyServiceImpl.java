package com.hdliu.wxems.service.impl;

import com.hdliu.wxems.dao.TReplyMapper;
import com.hdliu.wxems.entity.TReply;
import com.hdliu.wxems.entity.TReplyExample;
import java.util.List;
import com.hdliu.wxems.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;

public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private TReplyMapper mapper;

    @Override
    public long countByExample(TReplyExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TReplyExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TReply record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TReply record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<TReply> selectByExampleWithBLOBs(TReplyExample example) {
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<TReply> selectByExample(TReplyExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public TReply selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TReply record, TReplyExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(TReply record, TReplyExample example) {
        return mapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(TReply record, TReplyExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TReply record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TReply record) {
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(TReply record) {
        return mapper.updateByPrimaryKey(record);
    }
}
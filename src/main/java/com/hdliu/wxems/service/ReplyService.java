package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TReply;
import com.hdliu.wxems.entity.TReplyExample;

import java.util.List;

public interface ReplyService {
    long countByExample(TReplyExample example);

    int deleteByExample(TReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TReply record);

    int insertSelective(TReply record);

    List<TReply> selectByExampleWithBLOBs(TReplyExample example);

    List<TReply> selectByExample(TReplyExample example);

    TReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TReply record, TReplyExample example);

    int updateByExampleWithBLOBs(TReply record, TReplyExample example);

    int updateByExample(TReply record, TReplyExample example);

    int updateByPrimaryKeySelective(TReply record);

    int updateByPrimaryKeyWithBLOBs(TReply record);

    int updateByPrimaryKey(TReply record);
}
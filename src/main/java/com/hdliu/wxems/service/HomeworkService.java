package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.THomework;
import com.hdliu.wxems.entity.THomeworkExample;

import java.util.List;

public interface HomeworkService {
    long countByExample(THomeworkExample example);

    int deleteByExample(THomeworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THomework record);

    int insertSelective(THomework record);

    List<THomework> selectByExample(THomeworkExample example);

    THomework selectByPrimaryKey(Integer id);

    int updateByExampleSelective(THomework record, THomeworkExample example);

    int updateByExample(THomework record, THomeworkExample example);

    int updateByPrimaryKeySelective(THomework record);

    int updateByPrimaryKey(THomework record);
}
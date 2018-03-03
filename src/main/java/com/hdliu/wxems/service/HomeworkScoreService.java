package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.THomeworkScore;
import com.hdliu.wxems.entity.THomeworkScoreExample;
import java.util.List;

public interface HomeworkScoreService {
    long countByExample(THomeworkScoreExample example);

    int deleteByExample(THomeworkScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THomeworkScore record);

    int insertSelective(THomeworkScore record);

    List<THomeworkScore> selectByExample(THomeworkScoreExample example);

    THomeworkScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(THomeworkScore record, THomeworkScoreExample example);

    int updateByExample(THomeworkScore record, THomeworkScoreExample example);

    int updateByPrimaryKeySelective(THomeworkScore record);

    int updateByPrimaryKey(THomeworkScore record);
}
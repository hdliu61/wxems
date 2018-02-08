package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.THomeworkScore;
import com.hdliu.wxems.entity.THomeworkScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THomeworkScoreMapper {
    long countByExample(THomeworkScoreExample example);

    int deleteByExample(THomeworkScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THomeworkScore record);

    int insertSelective(THomeworkScore record);

    List<THomeworkScore> selectByExample(THomeworkScoreExample example);

    THomeworkScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THomeworkScore record, @Param("example") THomeworkScoreExample example);

    int updateByExample(@Param("record") THomeworkScore record, @Param("example") THomeworkScoreExample example);

    int updateByPrimaryKeySelective(THomeworkScore record);

    int updateByPrimaryKey(THomeworkScore record);
}
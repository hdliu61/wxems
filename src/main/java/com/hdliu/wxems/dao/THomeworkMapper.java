package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.THomework;
import com.hdliu.wxems.entity.THomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THomeworkMapper {
    long countByExample(THomeworkExample example);

    int deleteByExample(THomeworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THomework record);

    int insertSelective(THomework record);

    List<THomework> selectByExample(THomeworkExample example);

    THomework selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THomework record, @Param("example") THomeworkExample example);

    int updateByExample(@Param("record") THomework record, @Param("example") THomeworkExample example);

    int updateByPrimaryKeySelective(THomework record);

    int updateByPrimaryKey(THomework record);
}
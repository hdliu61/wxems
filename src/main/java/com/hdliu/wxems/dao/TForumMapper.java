package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TForum;
import com.hdliu.wxems.entity.TForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TForumMapper {
    long countByExample(TForumExample example);

    int deleteByExample(TForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TForum record);

    int insertSelective(TForum record);

    List<TForum> selectByExample(TForumExample example);

    TForum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TForum record, @Param("example") TForumExample example);

    int updateByExample(@Param("record") TForum record, @Param("example") TForumExample example);

    int updateByPrimaryKeySelective(TForum record);

    int updateByPrimaryKey(TForum record);
}
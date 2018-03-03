package com.hdliu.wxems.service;

import com.hdliu.wxems.entity.TForum;
import com.hdliu.wxems.entity.TForumExample;
import java.util.List;

public interface ForumService {
    long countByExample(TForumExample example);

    int deleteByExample(TForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TForum record);

    int insertSelective(TForum record);

    List<TForum> selectByExample(TForumExample example);

    TForum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(TForum record, TForumExample example);

    int updateByExample(TForum record, TForumExample example);

    int updateByPrimaryKeySelective(TForum record);

    int updateByPrimaryKey(TForum record);
}
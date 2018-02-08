package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TReply;
import com.hdliu.wxems.entity.TReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TReplyMapper {
    long countByExample(TReplyExample example);

    int deleteByExample(TReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TReply record);

    int insertSelective(TReply record);

    List<TReply> selectByExampleWithBLOBs(TReplyExample example);

    List<TReply> selectByExample(TReplyExample example);

    TReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByExample(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByPrimaryKeySelective(TReply record);

    int updateByPrimaryKeyWithBLOBs(TReply record);

    int updateByPrimaryKey(TReply record);
}
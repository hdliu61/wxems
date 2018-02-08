package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TTerm;
import com.hdliu.wxems.entity.TTermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTermMapper {
    long countByExample(TTermExample example);

    int deleteByExample(TTermExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTerm record);

    int insertSelective(TTerm record);

    List<TTerm> selectByExample(TTermExample example);

    TTerm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTerm record, @Param("example") TTermExample example);

    int updateByExample(@Param("record") TTerm record, @Param("example") TTermExample example);

    int updateByPrimaryKeySelective(TTerm record);

    int updateByPrimaryKey(TTerm record);
}
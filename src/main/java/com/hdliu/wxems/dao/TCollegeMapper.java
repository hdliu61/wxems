package com.hdliu.wxems.dao;

import com.hdliu.wxems.entity.TCollege;
import com.hdliu.wxems.entity.TCollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCollegeMapper {
    long countByExample(TCollegeExample example);

    int deleteByExample(TCollegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollege record);

    int insertSelective(TCollege record);

    List<TCollege> selectByExample(TCollegeExample example);

    TCollege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCollege record, @Param("example") TCollegeExample example);

    int updateByExample(@Param("record") TCollege record, @Param("example") TCollegeExample example);

    int updateByPrimaryKeySelective(TCollege record);

    int updateByPrimaryKey(TCollege record);
}
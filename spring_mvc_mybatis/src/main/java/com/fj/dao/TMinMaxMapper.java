package com.fj.dao;

import com.fj.domain.TMinMax;
import com.fj.domain.TMinMaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMinMaxMapper {
    long countByExample(TMinMaxExample example);

    int deleteByExample(TMinMaxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMinMax record);

    int insertSelective(TMinMax record);

    List<TMinMax> selectByExample(TMinMaxExample example);

    TMinMax selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMinMax record, @Param("example") TMinMaxExample example);

    int updateByExample(@Param("record") TMinMax record, @Param("example") TMinMaxExample example);

    int updateByPrimaryKeySelective(TMinMax record);

    int updateByPrimaryKey(TMinMax record);
}
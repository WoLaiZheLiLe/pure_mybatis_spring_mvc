package com.fj.dao;

import com.fj.domain.OrderInfos;
import com.fj.domain.OrderInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfosMapper {
    long countByExample(OrderInfosExample example);

    int deleteByExample(OrderInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfos record);

    int insertSelective(OrderInfos record);

    List<OrderInfos> selectByExample(OrderInfosExample example);

    OrderInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderInfos record, @Param("example") OrderInfosExample example);

    int updateByExample(@Param("record") OrderInfos record, @Param("example") OrderInfosExample example);

    int updateByPrimaryKeySelective(OrderInfos record);

    int updateByPrimaryKey(OrderInfos record);
}
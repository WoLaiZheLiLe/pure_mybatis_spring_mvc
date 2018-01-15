package com.fj.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fj.domain.PersonDO;

@Repository
public interface PersonDao {
	Integer insert(PersonDO personDO);
	Integer update(@Param("id") Integer id, @Param("pDo") PersonDO personDO);
}

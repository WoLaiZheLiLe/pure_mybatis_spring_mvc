package com.fj.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fj.domain.PersonDO;

@Repository
public interface PersonDao {
	
	Integer insert(PersonDO personDO);
	
	Integer updatePerson(@Param("id") Integer id, @Param("name") Integer age);
	
}

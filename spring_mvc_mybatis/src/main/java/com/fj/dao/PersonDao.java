package com.fj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fj.domain.PersonDO;

@Repository
public interface PersonDao {
	
	Integer insert(PersonDO personDO);
	
	Integer updatePerson(@Param("id") Integer id, @Param("age") Integer age);
	
	List<PersonDO> query();
	
	PersonDO queryById(@Param("id") Integer id);
	
	List<PersonDO> queryByDynamicId(@Param("id") Integer id);
	
}

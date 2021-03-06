package com.fj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fj.domain.PersonDO;

public interface PersonService {
	
	/** 
	* @description: 111111
	* @author: fei_ji 
	* @date: 2018年1月17日 下午2:18:26
	* @version: v1.0
	* @param personDO
	* @return
	* @throws Exception  
	*/
	public Integer insert(List<PersonDO> personDO) throws Exception;
	
	
	public boolean updatePerson(Integer orderId, Integer id, Integer age);
	
	PersonDO queryById(@Param("id") Integer id);
}

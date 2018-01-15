package com.fj.service;

import java.util.List;

import com.fj.domain.PersonDO;

public interface PersonService {
	
	public Integer insert(List<PersonDO> personDO) throws Exception;
	
	public Integer update(Integer id, List<PersonDO> personDO); 
}

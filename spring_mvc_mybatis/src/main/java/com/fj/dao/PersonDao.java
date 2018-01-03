package com.fj.dao;

import org.springframework.stereotype.Repository;

import com.fj.domain.PersonDO;

@Repository
public interface PersonDao {
	Integer insert(PersonDO personDO);
}

package com.fj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fj.dao.PersonDao;
import com.fj.domain.PersonDO;
import com.fj.service.PersonService;

@Service("personServiceImpl")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Transactional
	public Integer insert(List<PersonDO> personDOList) throws Exception {
		Integer count = 0;
		try {
			count = insertEntity(personDOList);
		} catch (Exception e) {
			System.out.println("------------");
			e.printStackTrace();
		}
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	@Transactional
	public Integer insertEntity(List<PersonDO> personDOList) throws Exception {
		Integer count = 0;
		for (PersonDO personDo : personDOList) {
			personDao.insert(personDo);
			count++;
//			throw new RuntimeException("手动抛出异常");
		}
		return count;
	}

	@Transactional
	@Override
	public Integer update(Integer id, List<PersonDO> personDOList) {
		// TODO Auto-generated method stub
		Integer count = 0;
		for (PersonDO personDo : personDOList) {
			personDao.update(id, personDo);
			count++;
		}
		return count;
	}
}

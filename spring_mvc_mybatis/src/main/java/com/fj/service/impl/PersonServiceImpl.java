package com.fj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alibaba.fastjson.JSON;
import com.fj.dao.PersonDao;
import com.fj.domain.PersonDO;
import com.fj.service.OrderInfoService;
import com.fj.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private OrderInfoService orderInfoService;
	
	/* (non-Javadoc)
	 * @see com.fj.service.PersonService#insert(java.util.List)
	 *insert
	 *PersonServiceImpl
	 */
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
	public boolean updatePerson(Integer orderId, Integer id, Integer age) {
		//OrderInfos order = orderInfoService.selectByPrimaryKey(orderId);
//		try {
//			orderInfoService.updateOrderNo(id, "bbb");
//		} catch(Exception e)  {
//			System.out.println(e.getMessage());
//		}
		Integer updatePerson = personDao.updatePerson(id, age);
		try {
			orderInfoService.updateOrderNo(id, "bbb");
		} catch (Exception e) {
			TransactionStatus currentTransactionStatus = TransactionAspectSupport.currentTransactionStatus();
			System.out.println();
		}
		
		if (updatePerson == 1) {
			return true;
		}
		return false;
	}

	@Override
	public PersonDO queryById(Integer id) {
		PersonDO person = personDao.queryById(id);
		return person;
	}

}

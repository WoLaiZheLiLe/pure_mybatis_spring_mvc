package com.fj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fj.dao.OrderInfosMapper;
import com.fj.service.OrderInfoService;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	@Autowired
	private OrderInfosMapper orderInfoDao;
	
	@Transactional
	@Override
	public boolean updateOrderNo(Integer id, String score) {
		
		int updateOrderNo = orderInfoDao.updateOrderNo(id, score);
		if (updateOrderNo != 0) {
			throw new RuntimeException("OK-------------");
		}
		return false;
		//throw new RuntimeException("OK");
	}

}

package com.fj.service;

import com.fj.domain.OrderInfos;

public interface OrderInfoService {
	
	boolean updateOrderNo(Integer id, String orderNo);
	
	 OrderInfos selectByPrimaryKey(Integer id);
}	

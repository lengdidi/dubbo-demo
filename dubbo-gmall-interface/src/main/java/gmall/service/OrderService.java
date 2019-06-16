package com.ld.gmall.service;

import java.util.List;

import com.ld.gmall.bean.UserAddress;


public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}

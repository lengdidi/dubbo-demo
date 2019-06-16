package service.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.ld.gmall.bean.UserAddress;
import com.ld.gmall.service.OrderService;
import com.ld.gmall.service.UserService;

public class OrderServiceStub implements OrderService {
	private final UserService userService;

	// 传入的是远程调用的代理对象
	public OrderServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("本地存根被调用");
		if (!StringUtils.isEmpty(userId)) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}

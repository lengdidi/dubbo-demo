package gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ld.gmall.bean.UserAddress;
import com.ld.gmall.service.OrderService;
import com.ld.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class OrderServiceImpl implements OrderService {
//	@Autowired
	@Reference(url = "127.0.0.1:20882") // dubbo直连
	UserService userService;

	@HystrixCommand(fallbackMethod = "hello")
	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("用户Id:" + userId);
		// 1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		addressList.forEach(add -> {
			System.out.println(add.getUserAddress());
		});
		System.out.println(addressList.toString());
		return addressList;
	}

	public List<UserAddress> hello(String userId) {
		UserAddress address = new UserAddress(10, "测试", "1", "测试", "测试", "Y");
		return Arrays.asList(address);
	}

}

package service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.gmall.bean.UserAddress;
import com.ld.gmall.service.OrderService;
import com.ld.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;

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

}

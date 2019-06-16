package service.impl;

import java.util.Arrays;
import java.util.List;


public class UserServiceImpl implements com.ld.gmall.service.UserService {

    @Override
    public List<com.ld.gmall.bean.UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....old.....");
        com.ld.gmall.bean.UserAddress address1 = new com.ld.gmall.bean.UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        com.ld.gmall.bean.UserAddress address2 = new com.ld.gmall.bean.UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList(address1, address2);
    }

}

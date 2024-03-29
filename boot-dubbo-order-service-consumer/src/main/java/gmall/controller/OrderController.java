package gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ld.gmall.bean.UserAddress;
import com.ld.gmall.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;

	@RequestMapping("/initOrder")
	@ResponseBody
	public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
		return orderService.initOrder(userId);
	}
}

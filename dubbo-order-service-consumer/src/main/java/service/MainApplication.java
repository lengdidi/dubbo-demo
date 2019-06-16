package service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = ctx.getBean(OrderService.class);
		orderService.initOrder("1");
		System.out.println("调用完成");
		System.in.read();
	}
}

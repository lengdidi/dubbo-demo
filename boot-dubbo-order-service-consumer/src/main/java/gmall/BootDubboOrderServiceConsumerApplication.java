package gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableHystrix
@EnableDubbo
@SpringBootApplication
public class BootDubboOrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDubboOrderServiceConsumerApplication.class, args);
	}

}

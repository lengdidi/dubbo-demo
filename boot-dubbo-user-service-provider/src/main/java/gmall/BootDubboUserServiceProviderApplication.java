package gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

//可以使用xml文件的方式
//@ImportResource(locations = "classpath:provider.xml")
@EnableDubbo(scanBasePackages = "com.ld.gmall")
@EnableHystrix // 开启服务容错
@SpringBootApplication
public class BootDubboUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDubboUserServiceProviderApplication.class, args);
	}

}

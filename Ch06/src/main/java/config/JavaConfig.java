package main.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.spring.Client2;

@Configuration
public class JavaConfig {
	@Bean(initMethod = "connect", destroyMethod = "close")
	public Client2 client2(){
		Client2 client2 = new Client2();
		client2.setHost("서버 2");
		return client2;
	}
	

}

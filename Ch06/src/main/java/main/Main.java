package main.java.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.config.JavaConfig;
import main.java.spring.Client2;

public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Client2 client = ctx.getBean("client2", Client2.class);
		client.send();
		client.close();
	}

}

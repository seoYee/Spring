package main.java.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import main.java.spring.Client2;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:main/resource/springconf.xml");
		Client2 client = ctx.getBean("client2", Client2.class);
		client.send();
		ctx.close();
	}

}

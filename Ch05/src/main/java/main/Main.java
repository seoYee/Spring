package main.java.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import main.java.MemberInfoPrinter;
import main.java.MemberRegisterService;
import main.java.RegisterRequest;
import main.java.config.JavaConfig;

public class Main {
	public static void main(String[] args) {
		//스프링 컨테이너 생성시 GenericXmlApplicationContext 사용
		
		
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:main-conf.xml");
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		
		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("lee.seoyee9011@gmail.com");
		regReq.setName("이서이");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		
		infoPrinter.printMemberInfo("lee.seoyee9011@gmail.com");
	}

}

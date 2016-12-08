package main.java.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.MemberInfoPrinter;
import main.java.MemberRegisterService;
import main.java.RegisterRequest;
import main.java.config.ConfigPart1;
import main.java.config.ConfigPart2;

public class MainTwoConfs {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigPart1.class, ConfigPart2.class);
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

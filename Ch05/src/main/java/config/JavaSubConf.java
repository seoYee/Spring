package main.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import main.java.MemberDao;
import main.java.MemberPrinter;
import main.java.MemberRegisterService;

public class JavaSubConf {
	
	@Autowired
	private MemberDao memberDao;
	
	@Bean
	public MemberPrinter memberPrinter(){
		return new MemberPrinter();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDao);
	}

}

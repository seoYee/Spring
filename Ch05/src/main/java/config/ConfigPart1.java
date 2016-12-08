package main.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.MemberDao;
import main.java.MemberRegisterService;

@Configuration
public class ConfigPart1 {
	
	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDao());
	}

}

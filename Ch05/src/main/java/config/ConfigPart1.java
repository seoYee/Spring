package main.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import main.java.MemberDao;
import main.java.MemberRegisterService;

@Configuration
@Import(ConfigPart2.class)
public class ConfigPart1 {
	
	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService(memberDao());
	}

}

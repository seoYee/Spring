package main.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import main.java.MemberDao;
import main.java.MemberInfoPrinter;
import main.java.MemberPrinter;
import main.java.MemberRegisterService;

@Configuration
@ImportResource("classpath:sub-conf.xml")
public class JavaConfig {
	
	@Bean
	public MemberDao memberDao(){
		return new MemberDao();
	}
	@Bean
	public MemberRegisterService memberRegSvc(){
		//다른 bean 객체를 의존으로 주입할 경우,
		//해당 bean 객체의 메서드를 호출해서 의존 객체를 구한다.
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public MemberPrinter printer(){
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter(){
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}
}

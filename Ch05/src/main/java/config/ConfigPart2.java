package main.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.MemberDao;
import main.java.MemberInfoPrinter;
import main.java.MemberPrinter;

@Configuration
public class ConfigPart2 {
	
	//MemberDao 필드 추가
	@Autowired
	private MemberDao memberDao;
	
	@Bean
	public MemberPrinter printer(){
		return new MemberPrinter();
		
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter(){
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemDao(memberDao);
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}

}

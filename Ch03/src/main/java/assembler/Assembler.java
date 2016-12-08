package main.java.assembler;

import main.java.spring.ChangePasswordService;
import main.java.spring.MemberDao;
import main.java.spring.MemberRegisterService;

public class Assembler {
	
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler(){
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService(memberDao);
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService(){
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService(){
		return pwdSvc;
	}

}

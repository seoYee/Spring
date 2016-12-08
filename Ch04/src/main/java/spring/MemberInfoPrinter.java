package main.java.spring;

public class MemberInfoPrinter {
	
	private MemberDao memDao;
	private MemberPrinter printer;
	
	public void setMemDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email){
		Member member = memDao.selectByEmail(email);
		if(member==null){
			System.out.println("데이터없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}

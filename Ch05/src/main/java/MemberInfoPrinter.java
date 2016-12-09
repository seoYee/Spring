package main.java;

public class MemberInfoPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void setMemberDao(MemberDao memberDao) {
//		memberDao bean 객체는 한번만 생성되어 쓰이게 되는 싱글톤 형태
		System.out.println("MemberInfoPrinter 주입:" + memberDao);
		this.memberDao = memberDao;
	}
	
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email){
		Member member = memberDao.selectByEmail(email);
		if(member==null){
			System.out.println("데이터없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}

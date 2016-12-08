package main.java;

public class MemberInfoPrinter {
	
	private MemberDao memDao;
	private MemberPrinter printer;
	
	public void setMemDao(MemberDao memberDao) {
//		memberDao bean 객체는 한번만 생성되어 쓰이게 되는 싱글톤 형태
		System.out.println("MemberInfoPrinter 주입:" + memberDao);
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

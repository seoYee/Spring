package ver1_2;

public class Car {
	private Tire tire;
	
	public Car(){
//		tire = new KoreaTire();
		tire = new ChinaTire();
	}
	
	public void printInfo(){
		System.out.println("현재 장착 타이어는 :" + tire.getModel());
	}

}

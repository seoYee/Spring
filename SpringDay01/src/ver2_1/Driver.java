package ver2_1;

public class Driver {
	public static void main(String[] args) {
//		Car 객체에 주입하는 Tire 객체 생성
		KoreaTire tire = new KoreaTire();
//		tire 주입!
		Car myCar = new Car(tire);
		myCar.printInfo();
	}

}

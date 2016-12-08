package ver6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {
//	@Autowired(required=false) //아무데나 붙어도 됨
	private Tire tire;
	
	public Car(){}
	
//	@Autowired
	public Car(Tire tire){
		this.tire = tire;
	}
	@Autowired
	@Qualifier("koreaTire")
	public void setTire(Tire tire){
		this.tire = tire;
	}
	
	public void printCarInfo(){
		System.out.println("현재 장착 타이어:"+tire.getModel());
	}

}

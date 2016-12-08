package ver6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ver6/applicationContext.xml");
		
		Car myCar = context.getBean("sonata",Car.class);
		
		System.out.println("소나타가져옴");
		myCar.printCarInfo();
	}

}

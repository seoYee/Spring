package ver3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("/src/ver3/applicationContext.xml");
		
		Car myCar = context.getBean("sonata",Car.class);
		
		Tire tire = context.getBean("koreaTire",Tire.class);
		
		
		myCar.setTire(tire);
		myCar.printCarInfo();
		
	}

}

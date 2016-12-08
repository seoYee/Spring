package ver5;

import org.springframework.stereotype.Component;

@Component("chinaTire")
public class ChinaTire implements Tire{
	@Override
	public String getModel(){
		return "대륙";
	}

}

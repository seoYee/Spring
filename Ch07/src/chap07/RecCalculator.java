package chap07;
//대상 객체
public class RecCalculator implements Calculator{
	
	@Override
	public long factorial(long num){
		if(num == 0){
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}

}

package chap07;
//대상 객체
public class ImpeCalculator implements Calculator{

	@Override
	public long factorial(long num){
		long start = System.currentTimeMillis();
		
		long result = 1;
		for (int i=1; i<=num ; i++){
			result *= i;
		}
		long end = System.currentTimeMillis();
		// printf -> %d 자리에 , 뒤에 있는 내용을 차례로 대입
		//System.out.printf("ImpeCalculator.factorial(%d) 실행시간 = %d \n", num, (end-start));
		return result;
	}
}

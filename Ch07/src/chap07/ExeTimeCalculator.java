package chap07;
//proxy : 핵심기능은 구현하지 않고 여러 객체에 공통으로 적용될 수 있는 기능 구현
public class ExeTimeCalculator implements Calculator{
	
	private Calculator delegate;
	
	public ExeTimeCalculator(Calculator delegate){
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num){
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행시간 = %d \n", delegate.getClass().getSimpleName(), num, (end-start));
		//System.out.println(delegate.getClass().getSimpleName()+ delegate.factorial(num)+"실행시간 = "+(end-start));
		return result;
	}
}

package chap07;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class ExeTimeAspect {
	
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
//		대상 객체 메서드 실행 전 현재 시간 구함
		long start = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally{
//		대상 객체 메서드 실행 후 현재 시간 구함
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("%s.%s(%s) 실행시간 : %d ns \n", 
					joinPoint.getTarget().getClass().getSimpleName(), 
					sig.getName(), Arrays.toString(joinPoint.getArgs()),(finish-start));
		}
		
	}

}

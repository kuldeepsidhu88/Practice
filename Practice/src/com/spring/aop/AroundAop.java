package com.spring.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAop implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		
		System.out.println("AROUND ADVICE Before Method- Executed");
		System.out.println("MethodName : "+arg0.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(arg0.getArguments()));
		
		try{
			Object result = arg0.proceed();
			System.out.println("AROUND ADVICE After Return- Executed");
			return result;
			
		}catch (Exception e) {
			System.out.println("AROUND ADVICE After Throw- Executed");
			//throw e;
		}
		return null;
	}

}

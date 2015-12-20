package com.spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowAop implements ThrowsAdvice{

	public void afterThrowing(Exception e) throws Throwable{
		try{
			System.out.println("AFTER THROW ADVICE - Executed !");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

package com.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.spring.Customer.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint){
		System.out.println("Log Before method");
		System.out.println("Method Name : "+joinPoint.getSignature().getName());
		System.out.println("---------------");
	}
	
	public void logBeforeXML(JoinPoint joinPoint){
		System.out.println("Log Before methodxml");
		System.out.println("Method Name : "+joinPoint.getSignature().getName());
		System.out.println("---------------");
	}
	
	@After("execution(* com.spring.Customer.deleteCustomer(..))" )
	public void logAfter(JoinPoint joinPoint){
		System.out.println("Log After method");
		System.out.println("Method Name : "+joinPoint.getSignature().getName());
		System.out.println("---------------");
	}
	
	//@AfterReturning(returning="result",pointcut="execution(* com.spring.Customer.showCustomerDetails(..))")
	public void logAfterReturning(JoinPoint joinPoint, Object result){
		System.out.println("Log AfterRetruning method");
		System.out.println("Method Name : "+joinPoint.getSignature().getName());
		System.out.println("Return Value : "+result);
		System.out.println("---------------");
	}
	
	//@AfterThrowing(throwing="error",pointcut="execution(* com.spring.Customer.*(..))")
	public void logAfterThrowing(JoinPoint joinPoint,Throwable error){
		System.out.println("Log AfterThrowing method");
		System.out.println("Method Name : "+joinPoint.getSignature().getName());
		System.out.println("Exception : "+error);
		System.out.println("---------------");
	}
	
	
	//@Around("execution(* com.spring.Customer.*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		
		try{
			System.out.println("AROUND - Before");
			System.out.println("Log Around method");
			System.out.println("Method Name : "+joinPoint.getSignature().getName());
			System.out.println("Args : "+Arrays.toString(joinPoint.getArgs()));
			joinPoint.proceed();
			System.out.println("AROUND - After");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("AROUND - Throw");
		}
	}
}

package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student stu = (Student) ctx.getBean("studentbean1") ;
		stu.showData();
		System.out.println("--------------");
		Student stu2 = (Student) ctx.getBean("studentbean2") ;
		stu2.showData();
		stu2.showAddress();
		stu2.showGrades();
		System.out.println("--------------");
		
		Student stuProxy2 = (Student) ctx.getBean("studentProxyBean2") ;
		stuProxy2.showData();
		stuProxy2.showAddress();
		stuProxy2.showGrades();
		stuProxy2.showException("Student Proxy 2");
		System.out.println("--------------");
		
		/*Student stuProxy = (Student) ctx.getBean("studentProxyBean") ;
		stuProxy.showData();
		stuProxy.showAddress();
		stuProxy.showGrades();
		//stuProxy.showException("Student Proxy 1");
		System.out.println("--------------");
		
		Student stuProxy3 = (Student) ctx.getBean("studentProxyBean3Advisor") ;
		stuProxy3.showData();
		stuProxy3.showAddress();
		stuProxy3.showGrades();
		stuProxy3.showException("Student Proxy 3");
		System.out.println("--------------");
		
		
		
		Student stuProxyRegEx = (Student) ctx.getBean("studentProxyBeanRegExAdvisor") ;
		stuProxyRegEx.showData();
		stuProxyRegEx.showAddress();
		stuProxyRegEx.showGrades();
		stuProxyRegEx.showException("Student Proxy RegEx");
		System.out.println("--------------");*/
		
		/*Customer cust = (Customer)ctx.getBean("customer");
		cust.addCustomer();
		System.out.println("**********");
		cust.deleteCustomer();
		System.out.println("**********");
		cust.showCustomerDetails();
		System.out.println("**********");
		cust.updateCustomer();
		System.out.println("**********");
		cust.showCustomerPin(1234);
		System.out.println("**********");*/
		
	}
}

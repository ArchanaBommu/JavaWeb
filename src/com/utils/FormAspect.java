package com.utils;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FormAspect {
	
	Logger logger=Logger.getLogger(FormAspect.class);
	
	@Pointcut("execution(* com.control.FirstController.storePerson(..))")
	public void mycut()
	{
		
	}
	
	@Before("mycut()")
	public void process()
	{
		logger.info("Form is about to be processed");
	}
	
	@AfterReturning(pointcut= "mycut()", returning = "x")
	public void afterReturningAdvice(Object x)
	{
		String ret =(String)x;
		if(x.equals("people"))
	
			logger.info("validation issues ..!!!");
		else if(x.equals("error"))
			logger.info("Server or db issues ..!!!");
		else
			logger.info("successful insertion");
					
	}

}

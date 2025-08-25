package com.komal.demo.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
 
//import lombok.extern.slf4j.Slf4j;
 
@Aspect // we are to spring this extra logic iam writing
@Component // a spring take care of this class (object creation)
@Slf4j
@Hidden // is used to hide the backend code
public class LoggingAspect {
 
	@Before("execution(* com.surya.example.controllers.addUser(..))")
	public void logbefore() {
		// log.warn("loging something before addNewUser Endpoint");
	}
 
}
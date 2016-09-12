package cn.core.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/* 默认值为第一个字母小写 */
@Component
//@Aspect
public class MyLog {
	//@Pointcut("execution(public * cn.core..*.add(..))")
	public void myMethod(){};
	
	//@Before("myMethod()")
	public void before() {
		System.out.println("before");
	}
	
	//@AfterReturning("execution(public * cn.core..*add*(..))")
	public void afterReturning() {
		System.out.println("afterReturning...");
	}
	
	//@AfterThrowing("execution(public * cn.core..*add*(..))")
	public void afterThrowing() {
		System.out.println("afterThrowing...");
	}
	
	//@After("execution(public * cn.core..*add*(..))")
	public void afterFinally() {
		System.out.println("aferFinally...");
	}
	
	//@Around("execution(public * cn.core..*add*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around start...");
		pjp.proceed();
		System.out.println("around end...");
	}
}

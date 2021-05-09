package com.myalley.springbuild.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {

    @Around("execution(* com.myalley..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long gapMs =finish - start;
            System.out.println("시간 Gap 측정 : " + joinPoint.toString() + " : " + gapMs + " ms");
        }
    }

}

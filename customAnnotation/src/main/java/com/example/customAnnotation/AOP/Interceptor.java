package com.example.customAnnotation.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class Interceptor {
    //@Around("@annotation(Kholouud)")
   @Around("execution(* com.example.serviceimpl..*(..))") //pointCut
    public Object annotation(ProceedingJoinPoint pjp) throws Throwable {

//beforelogic 1 -> user enters an input if null returns an exception
        String userInput = null;
        if (userInput != null) {
            System.out.println("the input is" + userInput);}
        else {throw new RuntimeException("please provide an input");}

//beforeLogic 2  ->if user

        Object result = pjp.proceed();
        //afterLogic

        return result;

    }

}
package org.javaacademy.pizza.aspect;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Pointcut(value = "execution(* org.javaacademy.pizza.service.*.*(..))")
    public void pointcut() {
    }

//    @Before("pointcut()")
//    public void logging(JoinPoint joinPoint) {
//        String className = joinPoint.getTarget().getClass().getName();
//        String methodName = joinPoint.getSignature().getName();
//        Object[] methodArgs = joinPoint.getArgs();
//        log.info("вызов метода {} с аргументами {}", className + "." + methodName, methodArgs);
//    }

    @Around("pointcut()")
    @SneakyThrows
    public Object logging(ProceedingJoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        String fullMethodName = className + "." + methodName;
        Object[] methodArgs = joinPoint.getArgs();
        methodArgs[0] = 150;
        log.info("вызов метода {} с аргументами {}", fullMethodName, methodArgs);
        Object result = joinPoint.proceed(methodArgs);
        log.info("результат работы метода {}: {}", fullMethodName, result);
        return result;
    }
}

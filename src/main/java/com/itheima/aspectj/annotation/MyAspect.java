package com.itheima.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.itheima.aspectj.annotation.*.*(..))")
    private  void myPointCut()
    {

    }
    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint)
    {
        System.out.println("前置通知：模拟执行权限检查");
        System.out.println("目标类是：" + joinPoint.getTarget());
        System.out.println(",被植入的目标方法为" + joinPoint.getSignature().getName());
    }
    @AfterReturning(value="myPointCut()")
    public void myAfterReturnign(JoinPoint joinPoint)
    {
        System.out.println("后置通知：模拟记录日志");

        System.out.println(",被植入的目标方法为" + joinPoint.getSignature().getName());
    }
    @Around("myPointCut()")
    public  Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws  Throwable
    {
        System.out.println("环绕开始");
        Object obj=proceedingJoinPoint.proceed();
        System.out.println("环绕结束");
        return obj;

    }
    @AfterThrowing(value="myPointCut()",throwing="e")
    public  void myAfterThrowing(JoinPoint joinPoint,Throwable e)
    {
        System.out.println("异常："+e.getMessage());
    }
    @After("myPointCut()")
    public  void myAfter()
    {
        System.out.println("最终通知");
    }

}

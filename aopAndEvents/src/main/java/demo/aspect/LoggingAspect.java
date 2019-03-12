package demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;
import java.util.Arrays;

@Aspect
public class LoggingAspect {
    //for Question4
    @Pointcut("this(demo.GreeterService)")
    void pointCutService(){}
    //for Question5
    @Around("pointCutService()")
    public ProceedingJoinPoint logMethod(ProceedingJoinPoint joinPoint)
    {
        System.out.println("Before  Method: "+joinPoint.getSignature());
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("After Method: "+joinPoint.getSignature());
        return joinPoint;
    }
    //for Questionn6
    @AfterThrowing(pointcut = "execution(* demo.*.*())",throwing = "ioException")
    public void logExceptionMethods(JoinPoint joinPoint,IOException ioException) throws Throwable
    {
        System.out.println("IOException thrown from: "+joinPoint.getSignature());
    }


    //for Question7
    //for Question9--used joint point and printed method signature  and arguments in before
    //use-->execution
    @Before("execution(public * demo.GreeterService.*(..))")
    public void executeBeforeService(JoinPoint joinPoint)
    {
        System.out.println("Logging before method of greeter service "+joinPoint.getSignature());
        System.out.println("Arguments: "+ Arrays.toString(joinPoint.getArgs()));
        System.out.println();
    }
    @After("execution(public * demo.GreeterService.*(..))")
    public void executeAfterService(JoinPoint joinPoint)
    {
        System.out.println("Logging after method of greeter service "+joinPoint.getSignature());
        System.out.println();
    }
    //use-->within
    @Before("within(demo.GreeterService)")
    public void executeBeforeAllService(JoinPoint joinPoint)
    {
        System.out.println("Logging before service methods using within for method"+ joinPoint.getSignature());
        System.out.println("Arguments: "+ Arrays.toString(joinPoint.getArgs()));
        System.out.println();
    }
    @After("within(demo.GreeterService)")
    public void executeAfterAllService(JoinPoint joinPoint)
    {
        System.out.println("Logging after service methods using within for method"+ joinPoint.getSignature());
        System.out.println();
    }
    //use-->args
    @Before("args(String)")
    public void logBeforeMethodsWithStringArgument(JoinPoint joinPoint)
    {
        System.out.println("Logging before methods with string argument"+joinPoint.getSignature());
        System.out.println("Arguments: "+ Arrays.toString(joinPoint.getArgs()));
        System.out.println();
    }
    @After("args(String)")
    public void logAfterMethodsWithStringArgument(JoinPoint joinPoint)
    {
        System.out.println("Logging after methods with string argument"+joinPoint.getSignature());
        System.out.println();
    }
    //use-->this
    //point-cut reuse--Question8
    @Before("pointCutService()")
    public void logBeforeUsingThis(JoinPoint joinPoint)
    {
        System.out.println("Logging before using this: "+joinPoint.getSignature());
        System.out.println("Arguments: "+ Arrays.toString(joinPoint.getArgs()));
        System.out.println();
    }
    @After("pointCutService()")
    public void logAfterUsingThis(JoinPoint joinPoint)
    {
        System.out.println("Logging after using this: "+joinPoint.getSignature());
        System.out.println();

    }
    //use-->bean
    @Before("bean(service)")
    public void logBeforeUsingBean(JoinPoint joinPoint)
    {
        System.out.println("Logging before using bean: "+joinPoint.getSignature());
        System.out.println("Arguments: "+ Arrays.toString(joinPoint.getArgs()));
        System.out.println();
    }
    @After("bean(service)")
    public void logAfterUsingBean(JoinPoint joinPoint)
    {
        System.out.println("Logging after using bean: "+joinPoint.getSignature());
        System.out.println();

    }

}

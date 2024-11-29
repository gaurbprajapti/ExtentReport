package rcrm.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    private static ExtentReports extent = ExtentManager.getInstance();

    @Before("execution(* rcrm.ExtentReport..*(..))")
    public void logBefore(JoinPoint joinPoint) {
    	System.out.print(joinPoint.getSignature().getName()+" checking method");
    }

    @After("execution(* *(..))")
    public void logAfter(JoinPoint joinPoint) {
    	System.out.print(joinPoint.getSignature().getName()+" executed method");
    }

}

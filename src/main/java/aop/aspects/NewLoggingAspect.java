package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookingLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookingLoggingAdvice:" +
                " в бибилотеку пытаются вернуть книгу");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Преступление и наказание";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookingLoggingAdvice: " +
                "в бибилотеку успешно вернули книгу");

        System.out.println("aroundReturnBookingLoggingAdvice: метод returnBook " +
                "выполнил работы за " + (end - begin) + " миллисекунд");
        return targetMethodResult;

    }
}

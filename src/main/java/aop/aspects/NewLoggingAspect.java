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

        Object targetMethodResult = null;
        try {

            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано" +
                    "исключение " + e);
            targetMethodResult = "Неизвестной название книги";
        }

        System.out.println("aroundReturnBookingLoggingAdvice: " +
                "в бибилотеку успешно вернули книгу");

        return targetMethodResult;

    }
}

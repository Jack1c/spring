package org.test.main;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Aspect切面
 */
@Aspect
public class AspectTest {
    /**
     * 配置切入点
     */
    public static final String POINT_CUT = "execution(* org.test.service.impl.UserServiceImpl.*(..))";



    @Before(POINT_CUT)
    public void beforeTest() {
        System.out.println("before test");
    }


    @After(POINT_CUT)
    public void afterTest() {
        System.out.println("after test");
    }


    //@Around(POINT_CUT)
    public Object arountTest(ProceedingJoinPoint joinPoint) {
        System.out.println("before1");
        Object object = null;

        try {
            object = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("after1");

        return object;
    }

}

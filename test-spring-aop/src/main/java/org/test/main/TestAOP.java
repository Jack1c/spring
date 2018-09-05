package org.test.main;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.service.UserInterface;
import org.test.service.impl.UserServiceImpl;

public class TestAOP {

    public static void main(String[] args){
        new TestAOP().testAOPAnnotation();
    }

    public void testAOPAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-annotataion.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.delete("001");
    }


    public void tespublictAOPXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-xml.xml");
        UserInterface userService = (UserInterface) context.getBean("userService");
        userService.delete("001");
    }
}

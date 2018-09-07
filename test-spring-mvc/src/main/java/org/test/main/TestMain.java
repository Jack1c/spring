/*
package org.test.main;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Server;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.jsp.jstl.core.Config;

public class TestMain {

    public static void main(String[] args) throws LifecycleException, ServletException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);
        Context context = tomcat.addContext("", "/");
        DispatcherServlet servlet = new DispatcherServlet();
        servlet.setContextConfigLocation("classpath:spring-mvc.xml");
        tomcat.addServlet("", "servlet", servlet);

        context.addServletMappingDecoded("*.do", "servlet");


        tomcat.start();
        tomcat.getServer().await();
    }


}
*/

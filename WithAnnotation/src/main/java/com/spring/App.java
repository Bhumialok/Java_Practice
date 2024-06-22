package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App {
 public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
     Employee emp=context.getBean("emp1",Employee.class);
     System.out.println(emp);
 }
}

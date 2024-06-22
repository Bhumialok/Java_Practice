package com.JavaConfigBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main( String[] args )
    {
       ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfigBased.class);
       Employee e1=(Employee)ctx.getBean("id1");
       e1.printEmp();
       }

}

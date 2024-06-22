package com.JavaConfigBased;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigBased {

	@Bean(name="id1")
 public  Employee getEmp()
 {
		AddressBean ab=new AddressBean(123,"Gaya","BR");
	
		Employee ab1=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name,salary,disgination");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		String designation=sc.next();
		
		ab1.setEmpid(id);
		ab1.setEnpname(name);
		ab1.setDesignation(designation);
		ab1.setSalary(salary);
		ab1.setAddr(ab);
		
	return ab1;
		
}
}
	
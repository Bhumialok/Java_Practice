package com.practice;

import java.util.HashSet;

class Demo{
	int id;
	String name;
	double salary;
	public Demo(int id,String name, double salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class Hashset_Demo {

	public static void main(String[] args) {
		HashSet<Demo> h= new HashSet<Demo>();
		Demo d1=new Demo(121,"Alok",30000.0);
		Demo d2=new Demo(122,"Ashish",35000.0);
		Demo d3=new Demo(123,"Vedant",38000.0);
		h.add(d1);
		h.add(d2);
		h.add(d3);
		for(Demo d:h) {
			System.out.println("employee id ="+d.id+"/"+"employee name ="+d.name+"/"+"employee salary ="+d.salary);
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}

}

package com.java_8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A{
	int pid;
	String name;
	String color;
	String brand;
	int price;
	public A(int pid,String name, String color, String brand, int price) {
		this.pid = pid;
		this.name=name;
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
}

public class Products {

	public static void main(String[] args) {
		List<A>productList=new ArrayList<A>();
		productList.add(new A(1, "Nord","Black","Oneplus",30000));
		productList.add(new A(2, "Iphone","White","Apple",50000));
		productList.add(new A(3, "S23","Grey","Samsung",45000));
		productList.add(new A(4, "F23","Yellow","Oppo",28000));
		productList.add(new A(5, "Phone2","Black","Nothing",38000));
		
		List<Integer>pricelist=productList.stream().filter(p->p.pid>40000) //filtering
				.map(m->m.pid)  //fetching
				.collect(Collectors.toList());
		System.out.println(pricelist);		

	}

}

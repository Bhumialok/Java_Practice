package com.practice;
import java.util.Iterator;
import java.util.*;

public class Vectors {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("Alok");
		v.add("Ashish");
		v.add("Vedant");
		v.add("Amit");
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());

	}
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		System.out.println(v);
	}
}

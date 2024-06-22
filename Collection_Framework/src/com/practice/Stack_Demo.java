package com.practice;
import java.util.*;

public class Stack_Demo {
	public static void main(String[] args) {
	Stack<String> s= new Stack<String>();
	s.push("Alok");
	s.push("Ashish");
	s.push("Vedant");
	s.push("Amit");
	s.pop();
	Iterator<String>itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	}

}

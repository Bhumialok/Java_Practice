package com.practice;
import java.util.*;

public class LinkedList_Demo {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Alok");
		l.add("Ashish");
		l.add("Vedant");
		l.add("Amit");
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

	}

}

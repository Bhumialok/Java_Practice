package com.java_8;

interface Number{
	public void show(int x);
}

public class LambdaExpression {

	public static void main(String[] args) {
		Number isEven=(x)->{
			if(x%2==0) {
				System.out.println(x+" "+"is even");
			}else {
				System.out.println(x+" "+"is odd");
			}
		};
		isEven.show(9);
		
		
	} 
}

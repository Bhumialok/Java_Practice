package com.java_8;

@FunctionalInterface
interface work{
	void start(String msg);
	default void done() {
		System.out.println("We can't define another abstract method after annotation.");
	}
}

public class Functional_Interface implements work{
	@Override
	public void start(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Functional_Interface f1=new Functional_Interface();
		f1.done();
		f1.start("Function Interface");

	}

}

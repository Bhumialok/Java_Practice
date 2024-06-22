package com.spring;

public class Student {
	private int id;
	private String sname;
	private int m1;
	private int m2;
	private int m3;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname, int m1, int m2, int m3) {
		super();
		this.id = id;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public void print() {
		System.out.println("StudentId = " + id +"\n" +"StudentName = "+sname+"\n"+"Java marks = "+m1+"\n"+"DBMS marks = "+m2+"\n"+"DAA marks = "+m3);
		int total =m1+m2+m3;
		System.out.println("Total Marks = " + total);
		double Average=total/3;
		System.out.println("Average = " + Average);
		if(Average>=70) {
			System.out.println("Grade = A");
		}
		else if(Average<=69) {
			System.out.println("Grade = B");
		}
		else if(Average<=49) {
			System.out.println("Grade = C");
		}
		else {
			System.out.println("Fail");
		}
	}
}

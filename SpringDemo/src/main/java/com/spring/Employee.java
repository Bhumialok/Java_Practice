package com.spring;

public class Employee {
	private int id;
	private String ename;
	private String design;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String ename, String design, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.design = design;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", design=" + design + ", salary=" + salary + "]";
	}
	

}

package com.JavaConfigBased;

public class Employee {
	
	 private int empid;
	 private String enpname;
	 private double salary;
	 private String designation;
	 //Dependency inject in the form of object
         private AddressBean addr;
	public Employee() {
		super();
	}
	
		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEnpname() {
			return enpname;
		}

		public void setEnpname(String enpname) {
			this.enpname = enpname;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public AddressBean getAddr() {
			return addr;
		}

		public void setAddr(AddressBean addr) {
			this.addr = addr;
		}

public void printEmp(){
	 System.out.println(empid);
	 System.out.println(enpname);
	 System.out.println(salary);
	 System.out.println(designation);
	 System.out.println(addr);}

}
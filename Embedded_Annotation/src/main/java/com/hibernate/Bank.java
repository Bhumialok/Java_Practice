package com.hibernate;

public class Bank {
		private int bid;
		private String bName;
		private String desgn;
		private int salary;
		public Bank() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Bank(int bid, String bName, String desgn, int salary) {
			super();
			this.bid = bid;
			this.bName = bName;
			this.desgn = desgn;
			this.salary = salary;
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getbName() {
			return bName;
		}
		public void setbName(String bName) {
			this.bName = bName;
		}
		public String getDesgn() {
			return desgn;
		}
		public void setDesgn(String desgn) {
			this.desgn = desgn;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
}

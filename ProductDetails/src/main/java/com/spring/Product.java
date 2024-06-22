package com.spring;

public class Product {
	private int id;
	private String Pname;
	private String Bname;
	private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String pname, String bname, int price) {
		super();
		this.id = id;
		Pname = pname;
		Bname = bname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print(){
		System.out.println("ProductId = "+id+"\n"+"ProductName = "+Pname+"\n"+"BrandName = "+Bname+"\n"+"Price = "+price);
		if(Bname=="Nestley") {
			System.out.println("To Purchase");
		}else {
			System.out.println("To Avoid");
		}
	}
}

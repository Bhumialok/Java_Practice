package net.aggregatejava;

public class Student {
    int id;
    String name;
    Address address;
    
    public Student(int id,String name, Address address) {
    	super();
    	this.id = id;
    	this.name = name;
    	this.address = address;
    }
    void display() {
    	System.out.println(id+" "+name);
    	System.out.println(address.city+""+address.state+""+address.country);
    }
	public static void main(String[] args) {
		Address a = new Address("Gaya","Br","India");
		Address a1 = new Address("Delhi","Dl","India");

		Student s1 = new Student(101,"Alok",a);
		Student s2 = new Student(102,"Anand",a1);
		s1.display();
		s2.display();
	}

}

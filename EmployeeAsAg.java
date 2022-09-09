package com.assignment;

public class EmployeeAsAg {
	int id;
	String pwd;
	String name;

	public EmployeeAsAg(int id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public static void main(String[] args) {
		Add a =new Add(123, "!qazwe3$!", "Lalit", 460665, "Bhopal", "Bahwan CyberTek");
		System.out.println("Details of employees =>");
		System.out.println("Emp Name: "+a.name);
		System.out.println("Emp id: "+a.id);
		System.out.println("Emp Access code: "+a.pwd);
		System.out.println("Emp Organization Name: "+a.org);
		System.out.println("Emp City: "+a.city);
		System.out.println("Emp Pincode: "+a.pincode);
	}

}

class Add extends EmployeeAsAg{
	int pincode;
	String city;
	String org;
	public Add(int id, String pwd, String name, int pincode, String city, String org) {
		super(id, pwd, name);
		this.pincode = pincode;
		this.city = city;
		this.org = org;
	}
	
	
}


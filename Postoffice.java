package com.assignment;

public class Postoffice {
	
	String name;
	int srcno;
	
	public Postoffice(String name, int srcno) {
		super();
		this.name = name;
		this.srcno = srcno;
	}

	public static void main(String[] args) {
		Ad a = new Ad("POSTAL SERVICES", 3421, 450001, "Chennai");
		System.out.println("Nearest Postal Detals ---> ");
		System.out.println("Name of the post office : "+a.name);
		System.out.println("Service no of the post  : "+a.srcno);
		System.out.println("Located in : "+a.city+" "+a.pincode);
	}

}

class Ad extends Postoffice{
	int pincode;
	String city;
	public Ad(String name, int srcno, int pincode, String city) {
		super(name, srcno);
		this.pincode = pincode;
		this.city = city;
	}
	
}

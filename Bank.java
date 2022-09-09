package com.assignment;

public class Bank {

	String branch;
	String ifsc;
	String city;
	int pincode;
	
	public Bank(String branch, String ifsc, String city, int pincode) {
		super();
		this.branch = branch;
		this.ifsc = ifsc;
		this.city = city;
		this.pincode = pincode;
	}

	public static void main(String[] args) {
		Operation opt = new Operation("SBI Navalur", "SBIN0003211", "Chennai", 420003, 40000, 7500, 47500);
		System.out.println("Banking Details => \n");
		System.out.println("Branch name: "+opt.branch);
		System.out.println("City: "+opt.city+" "+opt.pincode+"\n");
		System.out.println("Total amount in your account  : "+opt.total);
		System.out.println("Debited amount from your acc  : "+" "+opt.debit);
		System.out.println("Remaining amount from your ac : "+opt.credit);
	}

}

class Operation extends Bank{
	int credit;
	int debit;
	int total;
	public Operation(String branch, String ifsc, String city, int pincode, int credit, int debit, int total) {
		super(branch, ifsc, city, pincode);
		this.credit = credit;
		this.debit = debit;
		this.total = total;
	}
}

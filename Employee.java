package com.assignment;
import java.util.*;


public class Employee {
	
//	create data member
	private int empId, empAge;
	private String empName, empCity, empState;
	
//	default constructor
	public Employee() {
		super();
		System.out.println("default constructor's print statement-\nEmployee details =>");
	}
	
//	parameterized constructor
	public Employee(int empId, int empAge, String empName, String empCity, String empState) {
		super();
		this.empId = empId;
		this.empAge = empAge;
		this.empName = empName;
		this.empCity = empCity;
		this.empState = empState;
	}
	
//	getter and setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpState() {
		return empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}
	
	
//	main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter empId :-");
		int a = sc.nextInt();
		System.out.println("enter empAge :-");
		int b = sc.nextInt();
		System.out.println("enter empName :-");
		String c = sc.next();
		System.out.println("enter empCity :-");
		String d = sc.next();
		System.out.println("enter empState :-");
		String e = sc.next();
		
		Employee emp = new Employee(a,b,c,d,e);
		Employee emp1 = new Employee();
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpAge());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpCity());
		System.out.println(emp.getEmpState());
		
	}



	

}

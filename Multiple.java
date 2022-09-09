package com.assignment;

//interface
class Multiple implements A, B{
	
	public void show() {
		System.out.println("abc");
	}
	
	public void print() {
		System.out.println("xyz");
	}
	
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.show();
		m.print();
	}

}

interface A {
	public void show();

}

interface B {
	public void print();
}

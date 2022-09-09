package com.assignment;

public class Hybrid {
	String hclass ="Hybrid";
	public static void main(String[] args) {
		Single s = new Single();
		Heirarchi1 h1 = new Heirarchi1();
		Heirarchi2 h2 = new Heirarchi2();
		System.out.println(s.hyclass+" inheritance achieved by "+s.hclass+" class");
		System.out.println(h1.hyclass+" class inherite by "+h1.a1);
		System.out.println(h2.hyclass+" class inherite by "+h2.a2);
	}

}

class Single extends Hybrid{
	String hyclass ="Single";
}

class Heirarchi1 extends Single{
	String a1 ="First class";
}

class Heirarchi2 extends Single{
	String a2 ="Second class";
}


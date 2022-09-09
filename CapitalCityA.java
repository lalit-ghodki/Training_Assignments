package com.assignment;

import java.util.ArrayList;

public class CapitalCityA {

	public static void main(String[] args) {
//		create ArrayList
		ArrayList <String> capitalCity = new ArrayList<String> ();
		capitalCity.add("Mumbai");
		capitalCity.add("Chennai");
		capitalCity.add(2, "Kolkata");
		capitalCity.add(3, "New Delhi");
		
		
		for(String a : capitalCity) {
			System.out.println(a);
		}
		
		System.out.println("--------");
		System.out.println("get(1) the first value : "+capitalCity.get(1));
		System.out.println("--------");
		capitalCity.add(2, "Indore");
		System.out.println("after update: "+capitalCity);
		capitalCity.remove(2);
		System.out.println("after remove() : "+capitalCity);
		
		
	}

}

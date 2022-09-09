package com.assignment;

import java.util.LinkedList;

public class CapitalCityL {

	public static void main(String[] args) {
		LinkedList <String> CapitalCity = new LinkedList<>();
				CapitalCity.add("Mumbai");				CapitalCity.add("Chennai");				CapitalCity.add("Kolkata");				CapitalCity.add("New Delhi");
		
		System.out.println(CapitalCity);
		System.out.println("-----");
		
		System.out.println("update the values:- ");
		CapitalCity.add(2, "indore");
		System.out.println(CapitalCity);
		
		System.out.println("-----");
		System.out.println("get the first values:- ");
		System.out.println(CapitalCity.getFirst());
		
		System.out.println("-----");
		System.out.println("after remove the values:- ");
		CapitalCity.remove(2);
		for(int i=0; i<CapitalCity.size(); i++) {
			System.out.println("key :- "+i+" & value:- "+CapitalCity.get(i));
		}
		
	}

}

package com.assignment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CapitalCityH {

	public static void main(String[] args) {
		HashMap<Integer, String> capitalCity = new HashMap<>();
		
		System.out.println("put() the values in HashMap :-");
		capitalCity.put(1, "Chennai");
		capitalCity.put(2, "Mumbai");
		capitalCity.put(3, "New Delhi");
		capitalCity.put(4, "Kolkata");
		System.out.println(capitalCity);
		
		System.out.println("---------");
		System.out.println("update the values:- ");
		capitalCity.put(2, "Indore");
		System.out.println(capitalCity);
		
		System.out.println("---------");
		System.out.println("after remove the values:- ");
		capitalCity.remove(2);
		System.out.println(capitalCity);
		
		System.out.println("---------");
		System.out.println("update the values:- ");
		capitalCity.put(2, "Mumbai");
		
		System.out.println("---------");
		System.out.println("print thevalue by while loop");
		Set s = capitalCity.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry e = (Map.Entry)i.next();
			System.out.println(e);
			
		}
	}

}

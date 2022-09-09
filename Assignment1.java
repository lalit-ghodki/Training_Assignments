package com.assignment;
import java.util.*;

public class Assignment1 {
	public static void main(String []args) {
		
		int pAge = 21;
		String pName = "Lalit", pAdd = "Betul", pOrg="Bahwan CyberTek", pLoc="Chennai";
		System.out.println("Enter the Employee name:-");
		Scanner scan = new Scanner(System.in);
	
		String input = scan.nextLine();
		if(input.equalsIgnoreCase(pName)) {
			System.out.println("Employee's details are :-");
			System.out.println("Name : "+pName+"\n"+"Address of employee: "+pAdd
					+"\n"+"Work in organization of : "+pOrg+"\n"+"And it is located in : "+pLoc);
		}else {
			System.out.println("error");
		}
		
//		String info = "--> Personal Details <--";	
//		System.out.println(info);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Name : ");
//		
//		String pName = sc.next();
//		System.out.println("Person Name : "+pName);
//		
//		System.out.println("Enter Age : ");
//		int pAge = sc.nextInt();
//		if(pAge>=22) {
//			System.out.println("i am a graduate");
//		}else {
//			System.out.println("i am still syudying");
//		}
//		
//		System.out.println("Enter an address of org : ");
//		String pAdd = sc.next();
//		if(pAdd == "bhopal") {
//			System.out.println("i live in "+pAdd);
//		}
//		
//		System.out.println("Enter location : ");
//		String pLoc = sc.next();
//		if(pLoc=="chennai") {
//			System.out.println("enter org name : ");
//			String pOrg = sc.next();
//			if(pOrg == "bct") {
//				System.out.println("i am work in "+pLoc+" at "+pOrg);
//			}
//			
//		}
		
	}
}

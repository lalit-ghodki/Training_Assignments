package com.assignment;
import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Use the switch statement and write java calculator program
		int n1, n2;
		System.out.println("Enter first num :- ");
		n1=sc.nextInt();
		System.out.println("Enter Second num :- ");
		n2=sc.nextInt();
		
		System.out.println("Choose an operation +, -, *, /, %");
		char opt = sc.next().charAt(0);
		
		switch(opt) {
		case '+':
			System.out.println("For addition ans is : "+(n1+n2));
			break;
		case '-':
			System.out.println("For addition ans is : "+(n1-n2));
			break;
		case '*':
			System.out.println("For addition ans is : "+(n1*n2));
			break;
		case '/':
			System.out.println("For addition ans is : "+(n1/n2));
			break;
		case '%':
			System.out.println("For addition ans is : "+(n1%n2));
			break;
		default :
			System.out.println("You entered wrong operation! ");
		}
		
		
		
		
		//Use the switch statement and find the vowels and consonants dynamically
		System.out.println("Enter a alphabet : ");
		int asci =sc.next().charAt(0);//97 to 122  //65 to 90
		if(  (asci<=122 && asci>=97) || (asci<=90 && asci>=65) ) {
			
			char real = (char) asci;
			switch(asci) {
				case 'A' :
					System.out.println("** it is a vowel **");
					break;
				case 'a' :
					System.out.println("** it is a vowel **");
					break;
				case 'E' :
					System.out.println("** it is a vowel **");
					break;
				case 'e' :
					System.out.println("** it is a vowel **");
					break;
				case 'I' :
					System.out.println("** it is a vowel **");
					break;
				case 'i' :
					System.out.println("** it is a vowel **");
					break;
				case 'O' :
					System.out.println("** it is a vowel **");
					break;
				case 'o' :
					System.out.println("** it is a vowel **");
					break;
				case 'U' :
					System.out.println("** it is a vowel **");
					break;
				case 'u' :
					System.out.println("** it is a vowel **");
					break;
				default :
					System.out.println("^^ it is a consonent ^^");
			}
			
		}
		else {
			System.out.println("you'r not enterd alphabet");
		}
	
	
	}
}

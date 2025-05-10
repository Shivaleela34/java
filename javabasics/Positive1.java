package com.techmaster.javabasics;

import java.util.Scanner;

public class Positive1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter a number: ");
		
		if((a>0) || (a!=0)){
			System.out.println("Positive");
		}
		else if((a<0)|| (a!=0)){
			System.out.println("Negative");
		}	
		else {
			System.out.println("Not valid");
		}
		sc.close();


	}
	

}

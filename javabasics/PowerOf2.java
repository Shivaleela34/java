package com.techmaster.javabasics;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner is a class
		//input the numbers
		System.out.println("Enter the number to check power of 2:");
		int number=sc.nextInt();
		
		if(number<0) {
			System.out.println(number+" is not power of 2");
		}
		
		//check if it is power of 2
		if((number & (number-1))==0){
			System.out.println(number + " is power of 2");
			
		} 
		sc.close();
	}

}

package com.techmaster.javabasics;

import java.util.Scanner;

public class DynamicDataAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer number=45;
		//Scanner
		Scanner sc=new Scanner(System.in); //Scanner is a class
		//input two number 
		System.out.println("Enter the first number(dividend):");
		int number1=sc.nextInt();
		System.out.println("Enter the second number(divisor):");
		int number2=sc.nextInt();
		//check if divisor is factor of dividend
		if(number1%number2==0) {
			System.out.println(number2 + " is a factor of " + number1);	
		}
		else {
			System.out.println(number2 + " is not a factor of " + number1);
		}
		sc.close();
	}

}

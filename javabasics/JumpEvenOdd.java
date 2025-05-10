package com.techmaster.javabasics;

import java.util.Scanner;

public class JumpEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //not compulsory take System.out.print for n
		System.out.println("Enter the number:");
		int i; // initialize out of for loop
		for(i=1;i<=n;i++) {
			if(i==0) //no need to use {}-curly brackets for one statement 
				System.out.println("number is Zero" + i);
			else if(i%2==0) {
				System.out.println("Even number:" +i);
				continue;
			}
			else
				System.out.println("Odd number:" +i);
		}
		sc.close();
	}
}

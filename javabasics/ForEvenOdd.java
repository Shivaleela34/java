package com.techmaster.javabasics;

import java.util.Scanner;

public class ForEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n + " is Even");
		}
		else {
			System.out.println(n + " is Odd");
		}
		sc.close();

	}

}

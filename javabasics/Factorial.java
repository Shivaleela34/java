package com.techmaster.javabasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  factorial  of a number u want: ");
		int n=sc.nextInt();
		int fact=1;      // it is variable s in place of sum
		for(int i=1;i<=n;i++) {
			 fact*=i;  //fact=i*fact
			 System.out.println(fact);
		}
		sc.close();

	}

}


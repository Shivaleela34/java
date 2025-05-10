package com.techmaster.javabasics;

import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		//input a number
		int n=sc.nextInt();
		//initial sum is zero(0)
		int sum=0;      // it is variable s in place of sum
		//iterate to last number
		for(int i=1;i<=n;i++) {
			 sum+=i;  //sum=i+sum
			 
		}
		//display the sum of N  natural number
		System.out.println(sum);
		sc.close();

	 }
	

}

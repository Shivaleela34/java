package com.techmaster.javabasics;

import java.util.Scanner;

public class MulFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num=obj.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println("Table of a number");
			System.out.println(num+"*"+i+"="+num*i);
		}
		obj.close();
		


	}

}

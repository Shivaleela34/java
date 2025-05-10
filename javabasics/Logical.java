package com.techmaster.javabasics;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=8;
		
		boolean check=((a==b) && (a>=b));
		System.out.println(check);
		
		boolean check1=((a<=b) || (a>b));
		System.out.println(check1);
		
		if((a&b)<=0) {
			System.out.println("number");
		}

	}

}

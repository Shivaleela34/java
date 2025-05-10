package com.techmaster.javabasics;

public class LogicalANDexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=53;
		int n2=29;
		int n3=42;
		int n4=28;
		int n5=51;
		
		boolean result=(n1==53) && (n2 != 30);
		System.out.println(result);
		boolean result1=(n3<=43) && (n4 == 29);
		System.out.println(result1);
		boolean result2=(n4>=20) && (n5 != 51);
		System.out.println(result2);
		boolean result3=(n3!=42) && (n5 == 51);
		System.out.println(result3);


	}

}

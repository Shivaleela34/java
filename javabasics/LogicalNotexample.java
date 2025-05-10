package com.techmaster.javabasics;

public class LogicalNotexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=53;
		int n2=29;
		int n3=42;
		int n4=28;
		int n5=51;
		//check if each number is greater than 30, then apply NOT
		System.out.println("!(n1>30):"+!(n1>30));
		System.out.println("!(n2>30):"+!(n2>30));
		System.out.println("!(n3>30):"+!(n3>30));
		System.out.println("!(n4>30):"+!(n4>30));
		System.out.println("!(n5>30):"+!(n5>30));

		// check if each number is even, then apply NOT
		System.out.println("!(n1%2==0):"+!(n1%2==0));
		System.out.println("!(n2%2==0):"+!(n2%2==0));
		System.out.println("!(n3%2==0):"+!(n3%2==0));
		System.out.println("!(n4%2==0):"+!(n4%2==0));
		System.out.println("!(n5%2==0):"+!(n5%2==0));

	}

}

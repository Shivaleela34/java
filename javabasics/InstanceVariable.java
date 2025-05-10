package com.techmaster.javabasics;

public class InstanceVariable {
	// body of the class -- any variables taken inside class is called instance variables
	int num1=10;
	int num2=25;
	int sum=num1+num2;
	//Do not use System along instance variables
	//System.out.println(sum);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method body
		InstanceVariable object=new InstanceVariable();
		System.out.println(object.num1);
		System.out.println(object.num2);
		System.out.println(object.sum);

	}

}

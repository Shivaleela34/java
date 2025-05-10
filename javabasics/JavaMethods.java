package com.techmaster.javabasics;

public class JavaMethods {
	public void example(){
		int number1=15;
		int number2=23;
		int add=number1+number2;
		System.out.println(add);
	}
	
	public int add(int num, int numb) {
		 int add1=num+numb;
		return add1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMethods obj=new JavaMethods();
		obj.example();
		obj.add(34, 45);

	}

}

package com.techmaster.javabasics;

public class Arithmatic {
	//method declaration
	//int --return type
	//void -- no return type
	//Parameters or arguments calling in method 
	public static void addition(double num1, double num2) {
		double add=num1+num2;
		System.out.println("Addition of 123 and 234 is:" +add);
	}
	public static void sub() {
		double num3=321;
		double num4=123;
		double sub=num3-num4;
		System.out.println("Subtraction of 321 and 123 is:" +sub);
	}
	//void return type  used here
	public void mul() {
		double num3=321;
		double num4=123;
		double multi=num3*num4;
		System.out.println("Multiplication of 321 and 123 is:" +multi);
	}
	//int return type used here --> return 0
	public int div() {
		double num3=321;
		double num4=123;
		double division=num3/num4;
		System.out.println("division of 321 and 123 is:" +division);
		return 0;
	}
	//private access specifier 
	private void mod() {
		double num3=321;
		double num4=123;
		double modu=num3%num4;
		System.out.println("Modulous of 321 and 123 is:" +modu);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------");
		addition(123,234);// pass by value // calling function, OR Invoking the function
		sub();// you can directly call the method name because we are using static in method declaration
		Arithmatic obj=new Arithmatic();// there no use of static in method declaration
		obj.mul();
		obj.div();
		obj.mod();

	}

}

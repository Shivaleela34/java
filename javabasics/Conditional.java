package com.techmaster.javabasics;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc=1234;
		int num=4321;
		// Relational operator
		//Arithmetic operator
		//Unary operator
		//logical operator
		if(abc != num) {
			System.out.println("if block executed!");
			System.out.println("if statement");
			System.out.println("condition is true!");


		}
		if(abc<num) {
			// condition true 1234<4321
			System.out.println("if block executed!");
			System.out.println("if statement");
			System.out.println("condition is true!");
			
		}
		
		if(abc>num) {
			// condition false 1234>4321 
			System.out.println("if block executed!");
			System.out.println("if statement");
			System.out.println("condition is true!");
			
		}
		
		if(abc<=num && abc!=num) { 
			// condition true
			System.out.println("if block executed!");
		    System.out.println("if statement");
		    System.out.println("condition is true!");
			
		}
		
		if(abc!=num && num != abc) {
			System.out.println("shiva");
			
		}
	    if(num==abc || abc<num) {
			System.out.println("correct"); 
		 }
	    if (abc<num || num>abc && num<=abc || abc==num) {
	    	int dig=0;
	    	dig++;
	    	dig--;
	    	System.out.println(++dig);
	    	System.out.println("i am intellegent fellow");
	    }
		
		
		
	}

}

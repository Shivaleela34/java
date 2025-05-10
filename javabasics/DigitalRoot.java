package com.techmaster.javabasics;

import java.util.Scanner;

public class DigitalRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digitRoot; // declaration
		Scanner obj=new Scanner(System.in); //Scanner is a class
		//input two numbers
		System.out.println("Enter the number:");
		int number=obj.nextInt();
		
		if(number==0) {
			digitRoot=0;
		}
		else if(number%9==0){
			digitRoot=9;
		}
		else {
			digitRoot=number%9;
		}
		System.out.println("The digital Root" + number + "is : " + digitRoot);
		obj.close();
 
	}
	

}

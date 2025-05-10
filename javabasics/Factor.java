package com.techmaster.javabasics;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=45;// static data allocation( write within the code)
		int number1=5;
		int num=56;
		int numb=8;
		if(number%number1==0) {
			System.out.println("if block executed");
			System.out.println(number1 +"is factor of"+ number);
		}
		else if(num%numb!=0) {
			System.out.println("else block executed");
			System.out.println(numb +"is factor of"+ num);
		}
		else {
			System.out.println("Inavalid Operation");
		}

	}

}

package com.techmaster.javabasics;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		while(c<=10) {
			if(c%2==0) {
				System.out.print("Even:" +c+ " ");
				c++;
				continue;
			}
			else if(c%2==1) {
				System.out.print("Odd:"+c+" ");
				c++;
			}
			else
				System.out.println(" number is zero");
		}

	}

}

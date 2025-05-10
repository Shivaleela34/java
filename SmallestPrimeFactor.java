package com.shiva.javabasics;

public class SmallestPrimeFactor {
	 public static int smallestPrimeFactor(int num) {
	        for (int i = 2; i <= num; i++) {
	            if (num % i == 0) {
	                return i;
	            }
	        }
	        return num;  // If no factor found, the number itself is prime
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 56;
	     System.out.println("The smallest prime factor of " + number + " is: " + smallestPrimeFactor(number));

	}

}

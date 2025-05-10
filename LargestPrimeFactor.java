package com.shiva.javabasics;

public class LargestPrimeFactor {
	public static int largestPrimeFactor(int num) {
        int factor = 2;
        while (factor * factor <= num) {
            if (num % factor == 0) {
                num /= factor;
            } else {
                factor++;
            }
        }
        return num;  // The remaining number is prime
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 56;
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor(number));

	}

}

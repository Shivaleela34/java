package com.shiva.javabasics;

public class NumberAppearFib35 {
	public static int countInFibonacci(int num) {
        int fib1 = 0, fib2 = 1;
        int count = 0;
        
        while (fib2 <= num) {
            if (fib2 == num) {
                count++;
            }
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
        }

        return count;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 13;
	     System.out.println("The number " + number + " appears " + countInFibonacci(number) + " time(s) in the Fibonacci sequence.");

	}

}

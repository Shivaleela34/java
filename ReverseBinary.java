package com.shiva.javabasics;

public class ReverseBinary {
	public static String reverseBinary(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder reversed = new StringBuilder(binary);
        return reversed.reverse().toString();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
        System.out.println("Reversed binary of " + number + " is: " + reverseBinary(number));

	}

}

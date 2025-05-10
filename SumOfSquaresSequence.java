package com.shiva.javabasics;

public class SumOfSquaresSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 10;  // Length of sequence
        int[] sequence = new int[n];
        sequence[0] = 0;  // First number
        sequence[1] = 1;  // Second number

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] * sequence[i - 1] + sequence[i - 2] * sequence[i - 2];
        }

        // Print the sequence
        for (int num : sequence) {
            System.out.print(num + " ");
        }

		
	}

}

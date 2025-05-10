package com.shiva.javabasics;
import java.util.Random;

public class RandomIncrease32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 10;  // Number of steps
        int position = 0;
        Random rand = new Random();

        for (int i = 0; i < steps; i++) {
            int step = rand.nextBoolean() ? 1 : -1;  // Randomly choose +1 or -1
            position += step;
        }

        System.out.println("Final position: " + position);

	}

}

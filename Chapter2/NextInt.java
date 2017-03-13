package com.java.nextInt;

import java.util.Random;
import java.util.Scanner;

public class NextInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();// accessor
		// Scanner's nextInt won't change any value of scanner
		// instance variable, it returns data.
		Random random = new Random();
		random.nextInt();// accessor
		// Random's nextInt doesn't change any value of random
		// instead it returns data.
		scanner.close();
	}

}

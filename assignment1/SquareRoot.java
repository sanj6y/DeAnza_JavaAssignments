package assignment1;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
	
		// Get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = sc.nextLong();
		sc.close();
		
		// Check if input is valid (Will also check that input is only made from digits when I learn how to do so)
		if (n < 0) {
			System.out.println("Cannot compute square root of a negative number. Please try again.");
			return;
		}
		
		// Call method to compute square root
		double answer = SquareRoot.sqrt(n);
		
		// Print the answer
		System.out.println("The approximate square root of " + n + " = " + answer);		
	}

	public static double sqrt (long n) {
		
		double lastGuess = 1;
		double nextGuess = (lastGuess + n/lastGuess)/2;
		
		while(nextGuess - lastGuess > 0.0001 || lastGuess - nextGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n/lastGuess)/2;
		}
		
		return nextGuess;	
	}		
}


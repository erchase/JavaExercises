package net.bohush.exercises.chapter20;

import java.util.Scanner;

public class Exercise07 {

	public static int numberOfCalls = 0;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();

		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
		System.out.println("Number of calls " + numberOfCalls);
	}

	public static long fib(long index) {
		numberOfCalls++;
		if (index == 0)
			return 0;
		else if (index == 1)
			return 1;
		else
			return fib(index - 1) + fib(index - 2);
	}
}
package com.gmq.entornos;

public class FactorialApp {

	public static void main(String[] args) {

		System.out.println(args[0]);

		int originalNumber = Integer.valueOf(args[0]);
		int factorial = CalculateFactorial(originalNumber);
		System.out.println(factorial);
	}

	private static int CalculateFactorial(int originalNumber) {
		int factorial = 1;

		for (int i = originalNumber; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
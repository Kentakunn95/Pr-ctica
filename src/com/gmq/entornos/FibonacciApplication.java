package com.gmq.entornos;

public class FibonacciApplication {

	public static void main(String[] args) {

		int i = Integer.valueOf(args[0]);

		int sum = 1;
		int fibo1 = 0;
		int fibo2 = 1;

		for (i = 1; i < 25; i++) {

			sum = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = sum;
		}

		System.out.println(sum);
	}
}

package com.it;

import java.util.stream.LongStream;

public class FactorialNumberTest {

	public static void main(String[] args) {
		System.out.println(findFactorial(0));
		System.out.println("********** Way Two *********");
		System.out.println(factorial(10L));
		System.out.println(newFactorial(20L));
	}

	private static int findFactorial(int number) {
		if (number == 1 || number==0) {
			return 1;
		} else {
			return number * findFactorial(number - 1);
		}
	}

	private static long factorial(long number) {
		return LongStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
	}
	
	private static long newFactorial(long n) {
		return LongStream.rangeClosed(1, n).reduce(1, (a,b)->a*b);
	}

}

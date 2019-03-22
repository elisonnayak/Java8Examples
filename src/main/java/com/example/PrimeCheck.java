package com.example;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		int number = Integer.MAX_VALUE; 
		System.out.println("Enter number to check if prime or not "); 
		while (number != 0) {
				number = scnr.nextInt(); 
				System.out.printf("Does %d is prime? %s", 
						number, 
						isPrime(number));
						//isPrimeOrNot(number), 
						//isPrimeNumber(number)); 
			}

	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		int sqrt = (int)Math.sqrt(number) + 1;
		System.out.println("SQRT"+sqrt);
		for(int i = 2;i<sqrt;i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeOrNot(int number) {
		// TODO Auto-generated method stub
		return true;
	}

	private static Object isPrimeNumber(int number) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

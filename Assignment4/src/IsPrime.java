/*
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		// Gets user input
		Scanner input = new Scanner(System.in);
		int userInt = input.nextInt();
		
		// Uses the isPrime instance method to see if the user input is a prime number
		MyInteger myInt = new MyInteger(userInt);
		boolean test1 = myInt.isPrime();
		System.out.println("Testing instance method, is Prime");
		
		// Prints out weather or not the user input is a number
		if (test1)
			System.out.println("isPrime: " + userInt + " is Prime");
		else
			System.out.println("isPrime: " + userInt + " is not Prime");
		
		// Uses the isPrime class method to see if the user input is a prime number
		boolean test2 = MyInteger.isPrime(userInt);
		System.out.println("--------------------------\nTesting class method (that takes a referance variable) is Prime");
		
		// Prints out weather or not the user input is a number
		if (test2)
			System.out.println("isPrime: " + userInt + " is Prime");
		else
			System.out.println("isPrime: " + userInt + " is not Prime");
		
	}
	
	static class MyInteger {
		
		int value;
		
		// Constructor Object
		MyInteger(int value) {
			
			this.value = value; 
			
		}
		
		// Getter that will return the integer value when called
		int getValue() {
			
			return value;
			
		}
		
		// isPrime instance method
		boolean isPrime() {
			
			for (int divisor = 2; divisor <= value / 2; divisor++){
				
				if (value % divisor == 0) return false;
			
			}
			
			return true;
		}
		
		// isPrime class method
		public static boolean isPrime(int MyInteger) {
			
			for (int divisor = 2; divisor <= MyInteger / 2; divisor++){
				
				if (MyInteger % divisor == 0) return false;
				
			}
			
			return true;
			
		}
		
	}

}

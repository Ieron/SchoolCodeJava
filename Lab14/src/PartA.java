/* 
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class PartA {

	public static void main(String[] args) {
		
		// Prompt user
		System.out.println("Enter a SSN in this format, including the dashes: DDD-DD-DDDD");
		
		Scanner input = new Scanner(System.in);
		
		// Get user input
		String SSN = input.nextLine();
		
		// Tests to see if input is in the valid format
		if (validSSN(SSN))
			System.out.println("Valid SSN");
		
		else
			System.out.println("Invalid SSN");

	}
	
	// Method that test if SSN is in this "DDD-DD-DDDD" format
	public static boolean validSSN(String s){
		
		// Checks if there are 11 chars
		if (s.length() != 11) return false;
			
		// Series of for loops that check if digits are used in the correct spots
		for (int i = 0; i <= 2; i++){
			
			if (digit(s.charAt(i)) == false) return false;
						
		}
		
		for (int i = 4; i <= 5; i++){
			
			if (digit(s.charAt(i)) == false) return false;
						
		}
		for (int i = 7; i <= 10; i++){
	
			if (digit(s.charAt(i)) == false) return false;
				
		}
		
		// if statements that check if dashes are used in the correct spots
		if (isDash(s.charAt(3)) == false) return false;
		if (isDash(s.charAt(6)) == false) return false;
		
		else		
			return true;
		
	}

	// Method to see if a char is a digit
	public static boolean digit(char c){
			
		if (Character.isDigit(c)) return true;
		
		else
			return false;
		
	}
	
	// Method to see if a char is a dash
	public static boolean isDash(char c){
	
		if (c == '-')
			return true;
		
		else
			return false;
		
	}

}

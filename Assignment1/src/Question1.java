/*
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// Scan for user input and prompt user for subtotal
		
		try (Scanner input = new Scanner(System.in)){;
		
		System.out.println("Enter subtotal: ");
		
		double subtotal = input.nextDouble();
			
		// Scan for user input and prompt user for taxrate
				
		System.out.println("Enter sales tax rate: ");
		
		double taxrateinput = input.nextDouble();
		double taxrate = (int)(taxrateinput) / 100.0;
			
		// Calculate tax and total
		
		double tax = taxrate * subtotal; 
		double total = tax + subtotal;
		
		// Print tax and total
		
		System.out.printf("Tax is $%4.2f", tax);
		System.out.printf(" Total is $%4.2f", total);

	}

}
}

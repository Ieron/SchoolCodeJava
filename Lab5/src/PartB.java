/*
 * David Smith
 * Section C
 */

import javax.swing.JOptionPane;

public class PartB {

	public static void main(String[] args) {
		
		// Prompt user, scan for input, and convert input to an int
		String input = JOptionPane.showInputDialog(null, "Enter the number of lines you would like: ");
		
		int lines = Integer.parseInt(input);
		
		// If statement that ends the program if input is > 99
		if (lines > 99) System.exit (0);
		
		// Nested for loop that prints the user's desired # of lines in a pyramid like pattern
		for (int num1 = lines; num1 > 0; num1--){
			
				for (int num2 = 1; num2 <= num1; num2++){
			
				System.out.print(num2);
			
			}
			
			// Creates a new line
			System.out.println();	
			
		}

	}

}

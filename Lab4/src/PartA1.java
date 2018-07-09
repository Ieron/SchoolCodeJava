/* 
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class PartA1 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)){;
		// Prompt user and scan for input
		
		System.out.println("Enter num1: ");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter num2: ");
		
		int num2 = input.nextInt();
		
		int num3 = 0;
		
		for (int i = num1; i <= num2; i++){
			
			num3++;
			
		}

		System.out.println("num3 = " + num3);
		
	}

}
}

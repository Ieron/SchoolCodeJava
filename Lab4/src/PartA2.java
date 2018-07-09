/* 
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class PartA2 {

	public static void main(String[] args) {
		
		int num1;
		int i = 0;
		
		try (Scanner input = new Scanner(System.in)){;		
	
		do {
			 
			System.out.println("Enter a number: ");
			
			num1 = input.nextInt();
			
			i++;
			
		} while (num1 >= 0);
		
		i -= 1;
		
		System.out.println(i + " numbers were read.");
		
	}

}
}

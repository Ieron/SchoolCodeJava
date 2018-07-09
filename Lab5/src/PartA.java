/* 
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class PartA {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)){;
		
		System.out.println("Enter a number: ");
		
		int num = input.nextInt();
		int i = 0;		
		
		while (num > 0 ^ num < 0){
			
			num = input.nextInt();
			i++;	
			
						
		}
		
		System.out.println(i + " number(s) were enterd.");
		
		}
		
	}
}

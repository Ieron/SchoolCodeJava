import java.util.Scanner;

/*
 * Author: David Smith
 * Class Section: C
 */
public class Calculate {
	
	private static Scanner input;

	/** Main Method */
	public static void main(String[] args) {
		
		//User prompt
		System.out.println("Enter the radius of a circle...");
		
		//Set variable for the radius by scanning for next input and variable for the area (result) 
				
		double radius;
		double area;
		
		input = new Scanner(System.in);
		radius = input.nextDouble();
		
		// Compute area for the circle
		area = radius * radius * 3.14159;
		
		// Print results
		System.out.println("The area of the first with a radius of " + radius + " is " + area + ".");		
	}

}

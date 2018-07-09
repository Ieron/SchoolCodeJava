/*David Smith
 * CSCI 1302 A
 */
import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		
		//Creates input object
		Scanner input = new Scanner(System.in);
		
		//Prompts user for input and assigns values to variables
		System.out.println("Enter values for a, b, c, d, e, and f");
		
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();
		System.out.println("Enter d: ");
		double d = input.nextDouble();
		System.out.println("Enter e: ");
		double e = input.nextDouble();
		System.out.println("Enter f: ");
		double f = input.nextDouble();
		
		//Creates L1 object
		LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);
		
		//Sees if equation is solvable
		Boolean solvable = l1.isSolvable();
		
		//If unsolvable gives user a message and terminates the program
		if (solvable == false) {
			
			System.out.println("The equation has no solution.");
			System.exit(0);
			
		}
		
		//Prints out user input
		System.out.println("\nThe vaules entered for your Linear Equation were: " + l1.getA() + ", " + l1.getB() + ", " + l1.getC()
				+ ", " + l1.getD() + ", " + l1.getE() + ", " + l1.getF());
		
		//Prints out solutions
		System.out.println("\nYour solutions are: x = " + l1.getX() + " and y = " + l1.getY());
		
	}

}

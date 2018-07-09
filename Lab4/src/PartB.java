/*
 * David Smith
 * Section C
 */
public class PartB {

	public static void main(String[] args) {
		// Set up format to show x, x^2, and x^3
		
		String c1 = "x";
		String c2 = "x - Squared";
		String c3 = "x - Cubbed";
		
		System.out.printf("%s     %s     %s", c1, c2, c3);
		System.out.println(" ");
		System.out.println("---   ----------      ----------");
		
		// Set variables used to hold values for x^2, x^3
		
		int xs;
		int xc;
		
		// For loop the runs until x = 10
		
		for (int x = 2; x < 10; x++) {
			
			// Equations to find x^2, x^3
			
			xc = x * x * x;
			xs = x * x;
			
			// Print out x, xs, xc
			
			System.out.printf("%d %7d %16d", x, xs, xc);
			System.out.println(" ");
			
		}

	}

}

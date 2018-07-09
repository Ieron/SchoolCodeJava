/* 
 * David Smith
 * Section C
 */

public class Question1 {

	public static void main(String[] args) {
		
		// Variables to hold user input
		String s;
		double n;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		
		// Prompt user and get input
		System.out.print("Please enter the number of students in the class: ");
		int numS = input.nextInt();
		
		// Creates two new arrays
		String names [] = new String [numS];
		double scores [] = new double [numS];
		
		// Prompt user and uses input to initialize the two new arrays
		for (int i = 0; i < scores.length; i++){
						
			
			System.out.print("\nPlease enter a students name: ");
			s = input.next();
			
			names[i] = s;
			
			System.out.print("\nPlease enter " + s + "'s score: ");
			n = input.nextDouble();
			
			scores[i] = n; 
			
		}
		
		selectionSort(scores, names);

	}
	
	// Method that sorts the two arrays in descending order (highest to lowest score)
	public static void selectionSort(double[] score, String[] name){
		
		// Variables used for swapping
		int maxIndex;
		double temp1;
		String temp2;
		
		// For loop that puts both arrays in descending order
		for (int i = score.length - 1; i > 0; i--){
			
			maxIndex = 0;
			
			for (int j = 1; j <= i; j++)
				if (score[j] < score[maxIndex]) maxIndex = j;
			
			temp1 = score[i];
			score[i] = score[maxIndex];
			score[maxIndex] = temp1;
			
			temp2 = name[i];
			name[i] = name[maxIndex];
			name[maxIndex] = temp2;
			
		}
		
		// Prints result (sorted arrays) in a clean format
		int classSize = score.length;
		System.out.println("\nThe class size is: " + classSize);
		String sc = "Score", dashes = "-----";
		System.out.printf("\nName%15s\n----%15s", sc, dashes);
		
		for (int i = 0; i < score.length; i++){
			
			System.out.printf("\n%-15s%s", name[i], score[i]);
			
		}
		
	}

}

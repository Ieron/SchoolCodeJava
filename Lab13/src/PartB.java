/*
 * David Smith
 * Section C
 */

import java.io.File;

public class PartB {

	public static void main(String[] args)throws Exception {
		
		File file = new File ("C:\\Users\\Ieron\\Desktop\\Lab13.txt");
		
		// Checks to see if Lab13.txt already exists		
		if (file.exists()) {
		
			File fileScale = new File ("C:\\Users\\Ieron\\Desktop\\Lab13_scale.txt");
			
			// Checks to see if Lab13_scale.txt already exists
			if (fileScale.exists()) {
				
				System.out.println("File already exists");
				System.exit(0);
				
			}
			
			java.util.Scanner input = new java.util.Scanner(file);
			
			// Creates a new file called Labe13_scale.txt
			java.io.PrintWriter output = new java.io.PrintWriter(fileScale);
			
			// While loop that populates the new file with the values in the file Lab13.txt multiplied by 10
			int n;
			while (input.hasNext()){
				
				n = Integer.parseInt(input.next()) * 10;
				output.print(n + " ");
			
			}
			
			input.close();
			output.close();
			
			java.util.Scanner inputScale = new java.util.Scanner(fileScale);
			
			// While loop that prints out the contents of Lab13_scale.txt
			while (inputScale.hasNext()){
				
				String a = inputScale.next();
				System.out.println(a);
			
			}
			
			inputScale.close();	
				
		}
		
		// Error message for when Lab13.txt doesn't exist
		else {
			
			System.out.println("File Lab13.txt does not exist");
			System.exit(0);
			
		}

	}

}

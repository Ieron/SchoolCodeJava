/*
 * David Smith
 * Section C
 */

import java.io.File;

public class PartA {

	public static void main(String[] args)throws Exception {
		
		File file = new File("C:\\Users\\Ieron\\Desktop\\Lab13.txt");
		
		if (file.exists()) {
			
			System.out.println("File already exists");
			System.exit(0);
			
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		int n;
		
		for (int i = 0; i <= 10; i++){
			
			n = (int) (Math.random()*100);
			
			output.print(n +" ");
			
		}
		
		output.close();
		
		java.util.Scanner input = new java.util.Scanner(file);
		
		while (input.hasNext()){
			
			System.out.print(input.next() + " ");
			
		}
		
		input.close();
		
	}

}

import java.io.*;
import java.util.Scanner;

public class WriteRoster {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Output file: ");
		String outputFileName = scan.next();
		
		FileWriter fw;
		PrintWriter pw;
		
		try{
			
			fw = new FileWriter(outputFileName);
			pw = new PrintWriter(fw);
			
			pw.print("Bugs");
			pw.print("\t");
			pw.print("Bunny");
			pw.print("\n");
			
			pw.print("Ron");
			pw.print("\t");
			pw.print("Paul");
			pw.print("\n");
			
			pw.print("John");
			pw.print("\t");
			pw.print("Lock");
			
			pw.close();
		}
		
		catch(IOException e0){
			
			System.out.println("Error opening file");
			
		}

	}

}

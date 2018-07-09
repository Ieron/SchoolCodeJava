import java.io.*;
import java.util.Scanner;

public class ReadRoster {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = scan.next();
		
		FileReader fr;
		BufferedReader br;
		
		try{
			
			fr = new FileReader(inputFileName);
			br = new BufferedReader(fr);
			
			String text = br.readLine();
			System.out.println("File contained: " + text);
			
			fr.close();
			
		}
		
		catch (FileNotFoundException e0){
			
			System.out.println("File not found");
		}
		
		catch (IOException e1){
			
			System.out.println("Error while processing your file");
			
		}

	}

}

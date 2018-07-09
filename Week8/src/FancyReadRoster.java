import java.io.*;

import javax.swing.JFileChooser;

public class FancyReadRoster {

	public static void main(String[] args) {
		
		JFileChooser fc = new JFileChooser();
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			
			FileReader fr;
			BufferedReader br;
			
			try{
				
				fr = new FileReader(fc.getSelectedFile());
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
		
		else {
			
			System.out.println("Invalid Selection");
			
		}

	}

}

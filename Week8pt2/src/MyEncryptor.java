import java.io.*;

import javax.swing.JFileChooser;

public class MyEncryptor {

	private int key;
	
	public MyEncryptor(int aKey){
		
		key = aKey;
		
	}
	
	public void encryptFile(String inFile, String outFile) throws IOException{
		
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		PrintWriter pw;
		
		fr = new FileReader(inFile);
		br = new BufferedReader(fr);
		fw = new FileWriter(outFile);
		pw = new PrintWriter(fw);
		
		int c = br.read();
		
		while(c != -1){
			
			System.out.println(c);
			char encryptedChar = (char) (c + key);
			pw.write(encryptedChar);
			c = br.read();
			
		}
		
		fr.close();
		pw.close();
		
	}
	
	public void decryptFile(String inFile, String outFile) throws IOException{
		
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		PrintWriter pw;
		
		fr = new FileReader(inFile);
		br = new BufferedReader(fr);
		fw = new FileWriter(outFile);
		pw = new PrintWriter(fw);
		
		int c = br.read();
		
		while(c != -1){
			
			char decryptedChar = (char) (c - key);
			pw.write(decryptedChar);
			c = br.read();
			
		}
		
		fr.close();
		pw.close();
		
	}
	
	public static void main(String[] args) {
		
		MyEncryptor me = new MyEncryptor(2);
		
		JFileChooser fc1 = new JFileChooser();
		fc1.setDialogTitle("Select File to Encrypt");
		if (fc1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			
			String inFile = fc1.getSelectedFile().getAbsolutePath();
			JFileChooser fc2 = new JFileChooser();
			fc2.setDialogTitle("Select Location and Name to Save As Encrypted File");
			
				if (fc2.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
					
					String outFile = fc2.getSelectedFile().getAbsolutePath();
					try {
						
						me.encryptFile(inFile, outFile);
						me.decryptFile(inFile, outFile);
					}
					
					catch(IOException e) {
						
						e.printStackTrace();
						
					}
					
				}
				
				else {
					
					System.out.println("Invalid selection");
					
				}
			
		}
		
	}

}

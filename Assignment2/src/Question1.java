/* 
 * David Smith
 * Section C
 */

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		
		// Prompt user and convert input to int
		
		String input1 = JOptionPane.showInputDialog(null, "What year did you get married in?");
			int year = Integer.parseInt(input1);
		
		String input2 = JOptionPane.showInputDialog(null, "What month?");
			int month = Integer.parseInt(input2);
		
		String input3 = JOptionPane.showInputDialog(null, "What day?");
			int day = Integer.parseInt(input3);
			
			

	}

}

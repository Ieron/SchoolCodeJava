/*
 * David Smith
 * Section C
 */

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		
		// Prompt user and scan for input/set variables
		
		String input = JOptionPane.showInputDialog(null, "Enter the tempeture: ");
						
		int temp = Integer.parseInt(input);
		
		String input2 = JOptionPane.showInputDialog(null, "Enter the wind speed: ");
		
		int windSpeed = Integer.parseInt(input2);

		double windChill = 0;
		
		// If statements to make sure user input will work with formula
		
		if (windSpeed < 2)
			
			JOptionPane.showMessageDialog(null, "Wind speed is less than 2mph");
			
		else if ((temp > 41)|(temp < -58))
			
			JOptionPane.showMessageDialog(null, "Temperature is less than -58F or grater then 41F");	

		else {
			
			// Equation to find Wind Chill
			windChill = (35.74 + (0.6215 * temp)) - (35.75 * Math.pow(windSpeed, 0.16)) + ((0.4275 * temp) * Math.pow(windSpeed, 0.16));
		
			// Print out Wind Chill rounded to one decimal place
			String windChillR = String.format("%2.1fF", windChill);
		
			JOptionPane.showMessageDialog(null, "The Wind Chill is currently " + windChillR);
		
		}
			
	}

}

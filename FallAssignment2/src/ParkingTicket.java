/* David Smith
 * CSCI 1302 A
 */

public class ParkingTicket {
	
	//constructor for the ParkingTicket object
	public ParkingTicket(){
		
	}
	
	//method that will report a ParkedCar's info
	public String reportCar(String model, String make, String color, String licenseNumber){
		
		return "\n\nThe ticketed car's info." + "\nThe car's make is: " + make + "\nThe car's model is: " + model + 
				"\nThe car's color is: " + color + "\nThe car's license number is: " + licenseNumber;
		
	}
	
	//method that will give the info of the PoliceOfficer who is giving the ticket
	public String officerInfo(String firstName, String lastName, int badgeNumber){
		
		return "\n\nThe officer's info, who gave the ticket." + "\nThe officer's last and first names are: " + firstName + ", " + lastName +
				"\nThe officer's badge number is: " + badgeNumber;
		
	}
	
	//method that will give the amount of the fine
	public String fineAmount(int minParked, int minPurchased){
		
		//int that holds how much time the car is being charged for 
		int chargeTime = minParked - minPurchased;
		//double that holds the fine amount
		double fine = 30.00;
		
		//subtracts 60min from the charge time so that the car is not charged extra for the first hour
		chargeTime -= 60;
		
		//while loop that adds $15 to the fine for every extra hour parked, after the first hour
		while (chargeTime > 60){
			
			fine += 15;
			chargeTime -= 60;
			
		}
		
		//returns the fine amount
		return "\nThe car was fined: $" + fine;
		
	}
	
}

/* David Smith
 * CSCI 1302 A
 */

public class PoliceOfficer {
	
	//variables for the PoliceOfficer constructor that hold info on the police officer
	private String firstName;
	private String lastName;
	private int badgeNumber;
	
	//constructor for the PoliceOfficer object
	public PoliceOfficer (String firstName, String lastName, int badgeNumber){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.badgeNumber = badgeNumber;
		
	}
	
	//getters that will return info on the PoliceOfficer
	public String getFirstName(){
		
		return firstName;
		
	}
	
	public String getLastName(){
		
		return lastName;
		
	}
	
	public int getBadgeNumber(){
		
		return badgeNumber;
		
	}
	
	//toString method that will return info on the PoliceOfficer
	public String toString(){
		
		return "\nThe officer's last and first names are: " + this.lastName + ", " + this.firstName +
				"\nThe officer's badge number is: " + this.badgeNumber; 
		
	}	
		
	//method that will determine if the parking meter's time has expired and if it has, it will ticket the car
	public String hasTimeExpired(int minParked, int minPurchased, String model, String make, String color, String licenseNumber){		
		
		//if statement that will create a ParkingTicket object if the car has been parked for longer than the time they have purchased
		if (minParked > minPurchased){
			
			ParkingTicket pt = new ParkingTicket();
			return "\nThe car's meter time has expired" + pt.fineAmount(minParked, minPurchased) + pt.reportCar(model, make, color, licenseNumber) + pt.officerInfo(firstName, lastName, badgeNumber);
						
		}
		
		//else statement that will return a String if the previous if statement's conditions are not met
		else { 
			
			return "\nThe car's meter time has not expired.";
			
		}
		
	}
}


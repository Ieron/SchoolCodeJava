/* David Smith
 * CSCI 1302 A
 */

public class ParkedCar {
	
	//private variables that hold values for the ParkedCar constructor
	private String cMake;
	private String cModel;
	private String cColor;
	private String cLicenseNumber;
	private int cMinParked;
	
	//constructor for the ParkedCar object
	public ParkedCar(String cMake, String cModel, String cColor, String cLicenseNumber, int cMinParked){
		
		this.cMake = cMake;
		this.cModel = cModel;
		this.cColor = cColor;
		this.cLicenseNumber = cLicenseNumber;
		this.cMinParked = cMinParked;
		
	}
	
	//getters to return info on the ParkedCar
	public String getCMake(){
		
		return cMake;
		
	}
	
	public String getCModel(){
		
		return cModel;
		
	}
	
	public String getCColor(){
		
		return cColor;
		
	}
	
	public String getCLicenseNumber(){
		
		return cLicenseNumber;
		
	}
	
	public int getCMinParked(){
		
		return cMinParked;
		
	}
	
	//toString method to return info on the car
	public String toString(){
		
		return "\nThe car's make is: " + this.cMake + "\nThe car's model is: " + this.cModel + 
				"\nThe car's color is: " + this.cColor + "\nThe car's license number is: " + this.cLicenseNumber + 
				"\nThe car has been parked for " + this.cMinParked + "min";
		
	}
	
}

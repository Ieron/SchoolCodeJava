/* David Smith
 * CSCI 1302 A
 */

public class ParkingMeter {
	
	//variable for the ParkingMeter constructor
	private int minPurchased;
	
	//constructor for the ParkingMeter
	public ParkingMeter(int minPurchased){
		
		this.minPurchased = minPurchased;
		
	}
	
	//getter that returns how many min were purchased
	public int getMinPurchased(){
		
		return minPurchased;
		
	}
	
	//toString method that returns info on the ParkingMeter
	public String toString(){
		
		return "\nTime purchesed is " + this.minPurchased + "min";
		
	}

}

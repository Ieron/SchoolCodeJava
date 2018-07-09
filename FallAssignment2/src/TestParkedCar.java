/* David Smith
 * CSCI 1302 A
 */

public class TestParkedCar {

	public static void main(String[] args) {
		
		//creates a PoliceOfficer, three ParkedCars, and three ParkingMeter objects
		PoliceOfficer po1 = new PoliceOfficer("Bob", "Smith", 13567);
		ParkedCar c1 = new ParkedCar ("Honda", "CRV", "Blue", "ABC1234", 30);
		ParkingMeter pm1 = new ParkingMeter (60);
		ParkedCar c2 = new ParkedCar ("Toyota", "Tundra", "Red", "AEC1235", 90);
		ParkingMeter pm2 = new ParkingMeter (60);
		ParkedCar c3 = new ParkedCar ("Mazda", "Miada", "Blue", "ARV1239", 270);
		ParkingMeter pm3 = new ParkingMeter (60);
		
		//determines if the first car needs a ticket, if so it will print out the car/police officer's info and the fine amount
		System.out.println("Has the first car's meter time expired?");
		String c1Info = po1.hasTimeExpired(c1.getCMinParked(), pm1.getMinPurchased(), c1.getCModel(), c1.getCMake(), c1.getCColor(), c1.getCLicenseNumber());
		System.out.println(c1Info);
		
		//determines if the second car needs a ticket, if so it will print out the car/police officer's info and the fine amount
		System.out.println("\nHas the second car's meter time expired?");
		String c2Info = po1.hasTimeExpired(c2.getCMinParked(), pm2.getMinPurchased(), c2.getCModel(), c2.getCMake(), c2.getCColor(), c2.getCLicenseNumber());
		System.out.println(c2Info);
		
		//determines if the second car needs a ticket, if so it will print out the car/police officer's info and the fine amount
		System.out.println("\nHas the third car's meter time expired?");
		String c3Info = po1.hasTimeExpired(c3.getCMinParked(), pm3.getMinPurchased(), c3.getCModel(), c3.getCMake(), c3.getCColor(), c3.getCLicenseNumber());
		System.out.println(c3Info);
		
		

	}

}

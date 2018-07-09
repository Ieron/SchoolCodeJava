//concrete component of food
public class Drink extends Food {

	public Drink(){
		
		description = "Drink: ";
	}
	
	@Override
	public int getInventory() {
		
		return 100;
	}

	@Override
	public double getCost() {
		
		return 1.99;
	}

}

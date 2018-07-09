//concrete component of food
public class HotFood extends Food {

	public HotFood(){
		
		description = "Hot Food: ";
	}
	
	@Override
	public int getInventory() {
		
		return 15;
	}

	@Override
	public double getCost() {
		
		return 2.49;
	}

}

//concrete component of food
public class PackagedFood extends Food {

	public PackagedFood(){
		
		description = "Packaged Food: ";;
	}

	@Override
	public int getInventory() {
		
		return 50;
	}

	@Override
	public double getCost() {
		
		return 1.99;
	}

}

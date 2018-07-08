//concrete decorator for that extends the TypeDecorator
public class HotDog extends TypeDecorator{

	Food food;
	
	public HotDog(Food food){
		
		this.food = food;
	}
	
	@Override
	public String getDescription() {
		
		return food.getDescription() + "A yummy hot dog.";
	}

	@Override
	public int getInventory() {
		
		return food.getInventory();
	}

	@Override
	public double getCost() {
		
		return food.getCost();
	}

}
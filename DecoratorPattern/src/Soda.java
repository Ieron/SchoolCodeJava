//concrete decorator for that extends the TypeDecorator
public class Soda extends TypeDecorator{

	Food food;
	
	public Soda(Food food){
		
		this.food = food;
	}
	
	@Override
	public String getDescription() {
		
		return food.getDescription() + "Some fizzy soda.";
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

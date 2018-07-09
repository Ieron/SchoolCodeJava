//concrete decorator for that extends the TypeDecorator
public class Chips extends TypeDecorator{

	Food food;
	
	public Chips(Food food){
		
		this.food = food;
	}
	
	@Override
	public String getDescription() {
		
		return food.getDescription() + "Some salty chips.";
	}

	@Override
	public int getInventory() {
		
		return food.getInventory() - 20;
	}

	@Override
	public double getCost() {
		
		return food.getCost();
	}

}

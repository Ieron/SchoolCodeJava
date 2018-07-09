//concrete decorator for that extends the TypeDecorator
public class CandyBar extends TypeDecorator{
	
	Food food;
	
	public CandyBar(Food food){
		
		this.food = food;
	}
	
	@Override
	public String getDescription() {
		
		return food.getDescription() + "A sweet candy bar.";
	}

	@Override
	public int getInventory() {
		
		return food.getInventory() - 30;
	}

	@Override
	public double getCost() {
		
		return food.getCost() - .50;
	}

}

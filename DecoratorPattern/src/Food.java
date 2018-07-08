//David Smith
//the parent class for food in a gas station
public abstract class Food {
	public String description;
	public int inventory;
	public double cost;

	
	public String getDescription() {
		return description;
	}
	
	abstract public int getInventory();	
	
	abstract public double getCost();
	
}

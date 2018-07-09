//tests the food class and its decorators
public class FoodTest {

	public static void main(String[] args) {
		
		Food item1 = new PackagedFood();
		
		item1 = new CandyBar(item1);
		System.out.println(item1.getDescription() + " | Inventory: " + item1.getInventory() + " | Cost: $" + item1.getCost());
		
		Food item2 = new Drink();
		
		item2 = new Soda(item2);
		System.out.println(item2.getDescription() + " | Inventory: " + item2.getInventory() + " | Cost: $" + item2.getCost());
		
		Food item3 = new PackagedFood();
		
		item3 = new Chips(item3);
		System.out.println(item3.getDescription() + " | Inventory: " + item3.getInventory() + " | Cost: $" + item3.getCost());
		
		Food item4 = new HotFood();
		
		item4 = new HotDog(item4);
		System.out.println(item4.getDescription() + " | Inventory: " + item4.getInventory() + " | Cost: $" + item4.getCost());

	}

}

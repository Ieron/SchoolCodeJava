//this class overrides each abstract method of the MakeFood class which it extends
//the cook method can then be used to call all four of these methods
public class MakeSandwitch extends MakeFood{

	private String topBread = "Wonder Bread";
	private String condiments = "Mayo, Mustard";
	private String filling = "Lettuce, Sallami, Ham";
	private String bottomBread = "Wonder Bread";
	
	@Override
	void prepareIngredients() {
		
		System.out.println("Igredients are being pulled...");
		System.out.println("Top Bread: " + topBread);
		System.out.println("Condiments: " + condiments);
		System.out.println("Filling: " + filling);
		System.out.println("Bottom Bread: " + bottomBread);
		System.out.println("Ingredients are prepared.\n");
	}

	@Override
	void combineIngredients() {
		
		System.out.println("Igredients are being added...");
		System.out.println("added... " + bottomBread);
		System.out.println("added... " + filling);
		System.out.println("added... " + condiments);
		System.out.println("added... " + bottomBread);
		System.out.println("Ingredients are combined.\n");
		
	}

	@Override
	void plateFood() {
		
		System.out.println("The sandwitch is plated.\n");
	}

	@Override
	void serveFood() {
		
		System.out.println("The sandwitch is served!\n");
	}

}

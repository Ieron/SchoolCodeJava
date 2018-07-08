//this class overrides each abstract method of the MakeFood class which it extends
//the cook method can then be used to call all four of these methods
public class MakeSoup extends MakeFood{
	
	private String baseIngredients = "Lentils, Carrots, Celery, potatos";
	private String broth = "Chicken Stock";
	private String spices = "Salt, Coriander, Cumin";
	
	@Override
	void prepareIngredients() {
		
		System.out.println("Igredients are being pulled...");
		System.out.println("Base Ingredients: " + baseIngredients);
		System.out.println("Broth: " + broth);
		System.out.println("Spices: " + spices);
		System.out.println("Ingredients are prepared.\n");
	}

	@Override
	void combineIngredients() {
		
		System.out.println("Igredients are being added...");
		System.out.println("added... " + broth);
		System.out.println("added... " + baseIngredients);
		System.out.println("added... " + spices);

		System.out.println("Ingredients are combined.");
		System.out.println("Soup is cooking...");
		System.out.println("...soup is finished cooking!\n");
	}

	@Override
	void plateFood() {
		
		System.out.println("The soup is plated.\n");
	}

	@Override
	void serveFood() {
		
		System.out.println("The soup is served!\n");
	}

}

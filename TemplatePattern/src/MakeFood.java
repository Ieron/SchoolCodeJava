
//abstract class that will act as a template for the classes that extend it
public abstract class MakeFood {
	
	//each abstract method will be overridden
	abstract void prepareIngredients();
	abstract void combineIngredients();
	abstract void plateFood();
	abstract void serveFood();
	
	//the cook method will be used to call each abstract method defined in this class
	public final void cook(){
		
		prepareIngredients();
		combineIngredients();
		plateFood();
		serveFood();
	}

}

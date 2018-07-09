
public class Pig extends Animal implements Edible {

	@Override
	public String howToPrepare(){
		return getName() + " is best toasted\n\n...\n...like in a toaster";
	}
	
	public Pig(){
		setName("pig");
		setNumLegs(4);
	}
	
}

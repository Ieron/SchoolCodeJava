//child class that extends the abstract Magical class
public class Programmer extends Magical{
	
	public Programmer(){
		
	castSpell = new CantCast();
	writeSpell = new WriteCode();
	}
	
	//sets function for the lookAt method
	@Override
	public void lookAt() {
		
		System.out.println("I'm a programmer! We make magic with code!");
	}
	
}

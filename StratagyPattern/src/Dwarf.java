//child class that extends the abstract Magical class
public class Dwarf extends Magical{

	public Dwarf(){
		
		castSpell = new CantCast();
		writeSpell = new MakeRune();
	}
	
	//sets function for the lookAt method
	@Override
	public void lookAt() {
		
		System.out.println("I'm a dwarf! I dig holes.");
	}

}

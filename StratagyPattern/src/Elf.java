//child class that extends the abstract Magical class
public class Elf extends Magical{

	public Elf(){
		
		castSpell = new CanCast();
		writeSpell = new GrowGardenSpell();
		}
	
	//sets function for the lookAt method
	@Override
	public void lookAt() {
		
		System.out.println("I'm an elf and I love nature!");
	}
	
}

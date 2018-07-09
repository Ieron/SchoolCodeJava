//David Smith
//creates an abstract class
public abstract class Magical {
	
	//calls interfaces
	CastSpell castSpell;
	WriteSpell writeSpell;
	
	public Magical(){
	}
	
	//abstract method, function changes for each child
	abstract public void lookAt();
	
	//methods for castSpell and writeSpell
	public void castASpell(){
	
		castSpell.castSpell();		
	}
	
	public void writeASpell(){
		
		writeSpell.writeSpell();	
	}
	
	//methods that allow write and cast spell methods to be dynamically changed
	public void setCastSpell(CastSpell cast){
		
		castSpell = cast;		
	}
	
	public void setWriteSpell(WriteSpell write){
		
		writeSpell = write;		
	}
	
}

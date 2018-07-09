
public abstract class Animal {

	private String name;
	private int numLegs;
	
	public int getNumLegs(){
		return numLegs;
	}
	
	public void setNumLegs(int legs){
		numLegs = legs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
}

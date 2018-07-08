//a type of membership that implements the discount class
public class Bronze implements Discount{
	
	String name;
	
	@Override
	public void setName(String name) {
		
		this.name = name;
	}
	
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public double getDisc() {
	
		return .05;
	}

}

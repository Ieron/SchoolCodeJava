//David Smith

//parent class that uses a singlton pattern
public class MembershipBenefits {
	
	//creates the single instance of the class
	private static MembershipBenefits instance = new MembershipBenefits();
	
	//private constructor prevents other classes from using this method
	private MembershipBenefits(){	
	}
	
	//used to call the single instance of the class
	public static MembershipBenefits getInstance(){
		
		return instance;
	}
	
	//sets membership information by creating a class when called. It then returns that class.
	public Discount setMembership(String mem, String name){
		
		if(mem == null) return null;
		
		else if(mem == "Bronze"){
			Bronze b = new Bronze();
			b.setName(name);
			return b;
		}
		
		else if(mem == "Silver"){
			Silver s = new Silver();
			s.setName(name);
			return s;
		}
		
		else if(mem == "Gold"){
			Gold g = new Gold();
			g.setName(name);
			return g;
		}
		
		return null;
	}
	
}

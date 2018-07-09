
//interface for discounts. It uses the MembershipBenefits singleton class to follow the factory pattern.
public interface Discount {
	
	public void setName(String name);
	
	public String getName();
	
	public double getDisc();
	
}

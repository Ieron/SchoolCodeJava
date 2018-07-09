//tests the MembershipBenefits class
public class TestMemB {

	public static void main(String[] args) {
		
		MembershipBenefits memB = MembershipBenefits.getInstance();
		
		//CustomerInfo takes in the customer name then their membership type
		Discount Joe = memB.setMembership("Bronze", "Joe");
		Discount Bill = memB.setMembership("Silver", "Bill");
		Discount Jimmy = memB.setMembership("Gold", "Jimmy");

		System.out.println("Name | Dicount Percent");
		System.out.println(Joe.getName() + " | " + Joe.getDisc()*100 + "%");
		System.out.println(Bill.getName() + " | " + Bill.getDisc()*100 + "%");
		System.out.println(Jimmy.getName() + " | " + Jimmy.getDisc()*100 + "%");
	}

}

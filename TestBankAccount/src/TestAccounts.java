
public class TestAccounts {

	
	public static void main(String[] args) {
		// BankAccount Testing
		BankAccount ba = new BankAccount("Bugs Bunny", 123456789);
		ba.deposit(500);
		System.out.println(ba.getAccHolder()+ " has "+ba.getBalance()+" dollars in his account");
		ba.withdraw(600);
		System.out.println(ba.getAccHolder()+ " has "+ba.getBalance()+" dollars in his account");
		
		//SavingAccount testing
		SavingAccount sa = new SavingAccount("Porky Pig", 234567891, 4);
		sa.deposit(500);
		System.out.println(sa.getAccHolder()+ " has "+sa.getBalance()+" dollars in his account");
		sa.addInterest();
		System.out.println(sa.getAccHolder()+ " has "+sa.getBalance()+" dollars in his account");
		sa.withdraw(600);
		System.out.println(sa.getAccHolder()+ " has "+sa.getBalance()+" dollars in his account");
		
		//CheckingAccount testing
		CheckingAccount ca = new CheckingAccount("Wile E Coyote", 234567891);
		ca.deposit(500);
		System.out.println(ca.getAccHolder()+ " has "+ca.getBalance()+" dollars in his account");
		ca.withdraw(600);
		System.out.println(ca.getAccHolder()+ " has "+ca.getBalance()+" dollars in his account");
		ca.withdraw(400);
		System.out.println(ca.getAccHolder()+ " has "+ca.getBalance()+" dollars in his account");
		ca.deductFees();
		System.out.println(ca.getAccHolder()+ " has "+ca.getBalance()+" dollars in his account");
		

	}

}


public class SavingAccount extends BankAccount{

	private double interestRate; //rate to be used to compute interest on account
	
	public SavingAccount(String accHolder, int accNum, double interestRate) {
		super(accHolder, accNum);
		this.interestRate = interestRate;
	}

	public void addInterest(){
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	}
	
	@Override
	public void withdraw(double amt){
		if((getBalance() - amt) < 0){
			System.out.println("Insufficient funds, withrawal cannot be completed at this time");
		}else {
			super.withdraw(amt);
		}
	}
}

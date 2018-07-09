
public class CheckingAccount extends BankAccount{

	private int transactionCount; //number of transactions on account
	private static final int FREE_TRANSACTIONS = 2; // number of free transactions per cycle
	private static final double TRANSACTION_FEE = 2.5; //cost per transaction
	
	public CheckingAccount(String accHolder, int accNum) {
			super(accHolder, accNum);		
	}

	public void deductFees(){
		if(transactionCount > FREE_TRANSACTIONS){
			double fees = (transactionCount - FREE_TRANSACTIONS) * TRANSACTION_FEE;
			super.withdraw(fees);
		}
	}
	
	public void withdraw(double amt){
		transactionCount++;
		super.withdraw(amt);
	}
	
	public void deposit(double amt){
		transactionCount++;
		super.deposit(amt);
	}
}

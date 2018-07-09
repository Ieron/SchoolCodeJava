/* David Smith
 * In class
 */
public class TestBank {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount("n1", 100, 200);
		CheckingAccount ca = new CheckingAccount("null", 500);
		BankAccount ba = new BankAccount("null", 600);
		BankAccount anyAccount;
		
		anyAccount = sa;
		BankAccount myBank[] = new BankAccount[10];
		myBank[0] = sa;
		myBank[1] = ca;
		myBank[2] = ba;
		double totalInBank = 0;
		for (int i = 0; i<2; i++){
			totalInBank += myBank[i].getBalance();
		}
	
		System.out.println("Behave like a SavingsAccount by adding interest ");
		if(anyAccount instanceof CheckingAccount){
			((CheckingAccount)anyAccount).deductFees();
		}
		else if (anyAccount instanceof SavingAccount){
			((SavingAccount)anyAccount).addInterest();
		}
		else if (anyAccount instanceof BankAccount){
			((BankAccount)anyAccount).deposit(300);
		}
		
		System.out.println("Balance is " + anyAccount.getBalance());
		
		System.out.println("Balance is "+ ba.getBalance());
		System.out.println("AccHolder is "+ ba.getAccHolder());
		
	}

}

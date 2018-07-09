
public abstract class BankAccount implements Comparable<BankAccount>{

	private double balance; // current balance of account
	private int accNum; // unique id for account
	private String accHolder; //name of account holder
	
	public BankAccount(String accHolder, int accNum){
		this.accHolder = accHolder;
		this.accNum = accNum;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getAccHolder(){
		return accHolder;
	}
	
	public int getAccNum(){
		return accNum;
	}
	
	public void deposit(double amt){
		balance+= amt;
	}
	
	public void withdraw(double amt) {
		balance-= amt;
	}
	
	
	public int compareTo(BankAccount ba){
		
		if(this.accNum == ba.accNum)
			return 0;
		else if (this.accNum > ba.accNum)
			return 1;
		else
			return -1;
		
	}
	
}

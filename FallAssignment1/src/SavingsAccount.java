/*David Smith
 * CSCI 1302 A
 */

public class SavingsAccount {
	
	//-double variables for the class
	private double annualInterestRate;
	private double accountBalance;
	private double totalWithdrawalAmount;
	private double totalDepositAmount;
	private double totalInterestEarned;
	
	//Constructor for SavingsAccount 
	SavingsAccount(double userStartingBalance, double userAnnualInterestRate){
		
		accountBalance = userStartingBalance;
		annualInterestRate = userAnnualInterestRate;
		
	}
	
	//Mutator that adds the deposit amount to the account's balance
	void deposit (double depositAmount){
		
		totalDepositAmount += depositAmount;
		accountBalance += depositAmount;
		
	}
	
	//Mutator that subtracts the withdrawal amount from the account's balance
	void withdrawal (double withdrawalAmount){
		
		totalWithdrawalAmount += withdrawalAmount;
		accountBalance -= withdrawalAmount;
		
	}
	
	//Mutator that calculates monthly interest and adds it to the account's balance
	void addMonthlyIntrest (){
		
		double monthlyInterest = annualInterestRate/12;
		double interestAmount = accountBalance*monthlyInterest;
		totalInterestEarned += interestAmount;
		accountBalance += interestAmount;
		
	}
	
	//Getters for the account's balance, Interest Earned, total deposit amount, and total withdrawal amount
	double getAccountBalance(){
		
		return accountBalance;
		
	}
	
	double getInterestEarned(){
		
		return totalInterestEarned;
		
	}
	
	double getTotalDepositAmount(){
		
		return totalDepositAmount;
		
	}
	
	double getTotalWithdrawalAmount(){
		
		return totalWithdrawalAmount;
		
	}
	
}

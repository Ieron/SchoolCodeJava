/*David Smith
 * CSCI 1302 A
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		//+Variables used in class to hold values used in while loop
		int monthsPassed = 1;
		double depositAmount;
		double withdrawalAmount;
		
		//Object used to round results to two decimal places
		DecimalFormat df = new DecimalFormat("#.##");
		//Object used to get user input
		Scanner input = new Scanner(System.in);
		
		//Prompt user and gain input for interest rate, starting balance, and account age
		System.out.println("What is the annual intrest rate for your bank account?");
		double annualInterestRate = input.nextDouble();
		System.out.println("What was its starting balance?");
		double accountBalance = input.nextDouble();
		System.out.println("How many months have passed since the account was established?");
		double monthsActive = input.nextDouble();
		
		//Object for the user's savings account
		SavingsAccount userAccount = new SavingsAccount(accountBalance, annualInterestRate);
		
		//While loop that finds total deposits/withdrawals and calculates monthly interest
		//Note: runs until data for each month is input
		while (monthsPassed < (monthsActive + 1)){
			
			System.out.println("Amount deposited during month " + monthsPassed + ".");
			depositAmount = input.nextDouble();
			userAccount.deposit(depositAmount);
			
			System.out.println("Amount withdrawn during month " + monthsPassed + ".");
			withdrawalAmount = input.nextDouble();
			userAccount.withdrawal(withdrawalAmount);
			
			userAccount.addMonthlyIntrest();
			
			monthsPassed++;
			
		}
		
		
		//Prints out/formats to two decimal places account balance, deposit/withdrawal amount, and interest earned
		System.out.println("Ending account balance: " + df.format(userAccount.getAccountBalance())
			+ "\nTotal deposit amount: " + df.format(userAccount.getTotalDepositAmount())
			+ "\nTotal withdrawl amount: " + df.format(userAccount.getTotalWithdrawalAmount())
			+ "\nTotal interest earned: " + df.format(userAccount.getInterestEarned()));

	}

}


public class TestComparable {

	public static void main(String[] args) {
		BankAccount[] bank = new BankAccount [3];
		bank[0] = new SavingAccount ("bugs", 3, 2);
		bank[1] = new CheckingAccount ("daffy", 4);
		bank[2] = new SavingAccount ("whaaaaa", 1, 4);
		
		for(int i = 0; i<3; i++){
			
			System.out.println("BA: " + bank[i].getAccHolder() + " no. " + bank[i].getAccNum());
			
		}
		
		java.util.Arrays.sort(bank);
		
		for(int i = 0; i<3; i++){
			
			System.out.println("BA: " + bank[i].getAccHolder() + " no. " + bank[i].getAccNum());
			
		}
				
	}

}

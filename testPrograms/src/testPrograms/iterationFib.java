package testPrograms;

public class iterationFib {

	public static void main(String[] args) {
		
		long fib1 = 0;
		long fib2 = 1;
		long n = 0;
		
		for (int i = 0; i <= 100; i++){
			
			if (i == 0){
			
				System.out.println(fib1);
			}
		
			else if (i == 1) {
			
				System.out.println(fib2);			
			}
		
			else {
			
				n = fib1 + fib2;
				fib1 = fib2;
				fib2 = n;
			
				System.out.println(i+" "+n);			
			}		
		}
	}
}

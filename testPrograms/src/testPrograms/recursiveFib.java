package testPrograms;

public class recursiveFib {
	

	public static void main(String[] args) {
		for (int i=0;i<100;i++){
			System.out.println(i + "  " + fib(i));
		}
		System.out.println(fib(100));
	}
	
	public static long fib(long n){
		
		long x;
		if (n == 0) return 0;
		if (n == 1) return 1;
		else{
			
			return fib(n-1) + fib(n-2);
			
		}		
	}

}

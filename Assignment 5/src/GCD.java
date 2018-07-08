/*
 * David Smith
 * CSCI 1302-A
 * DEC. 3/2015
 */

public class GCD {

	public static int findGCD(int m, int n){
		
		if (m % n == 0){
			
			return n;
			
		}
		
		return findGCD(n, m % n);
		
	}
	
	public static void main(String[] args){
		
		System.out.println(findGCD(30,43));
		
	}
	
}

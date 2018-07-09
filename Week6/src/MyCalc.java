/*
 * -------------------__----
 * --------@(-_-)@---|  |---
 * -----------~-----^^^^^^^-
 * ----------/|\----@(o_o)@-
 * ----------/-\---
 * ----------------
 */

import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numerator");
		int num = scan.nextInt();
		
		System.out.println("Enter the denominator");
		int denum = scan.nextInt();
		
		MyCalc c = new MyCalc();
		System.out.println("Answer is: " + c.div(num, denum));
		
	}
	
	public int div(int num, int denum){
		
		/*if (denum == 0){
			System.out.println("denominator can not = 0");
		}*/
		
		int result;
		
		try {
			result = num/denum;
		}
		
		catch(Exception e) {
			System.out.println("denom can not = 0");
			return -1;
		}
		
		finally {
			return result;
		}
			
		return result;
		
	}

}

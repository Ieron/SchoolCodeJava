/*
 * David Smith
 * CSCI 1302-A
 * DEC. 3/2015
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class gcdTest4 {

	@Test
	public void test() {
		
		GCD test = new GCD();
		int output = test.findGCD(205, 301);
		assertEquals(1, output);
		//GCD of 205 and 301 is 1 not 5
		
	}

}

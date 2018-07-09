/*
 * David Smith
 * CSCI 1302-A
 * DEC. 3/2015
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class gcdTest1 {

	@Test
	public void test() {
		
		GCD test = new GCD();
		int output = test.findGCD(2, 3);
		assertEquals(1, output);
		
	}

}

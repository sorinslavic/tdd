package tdd.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class PrimeFactorsTestCase {


	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testZero() {
		PrimeFactors.getList(0);
	}
	
	@Test
	public void testOne() {
		assertEquals(Collections.emptyList(),
			     PrimeFactors.getList(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(Arrays.asList(2),
			     PrimeFactors.getList(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(Arrays.asList(3), 
				PrimeFactors.getList(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(Arrays.asList(2, 2), 
				PrimeFactors.getList(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(Arrays.asList(2, 3), 
				PrimeFactors.getList(6));
	}
	
	@Test
	public void testNine() {
		assertEquals(Arrays.asList(3, 3), 
				PrimeFactors.getList(9));
	}
	
	@Test
	public void testEight() {
		assertEquals(Arrays.asList(2, 2, 2), 
				PrimeFactors.getList(8));
	}
	
	@Test
	public void test36() {
		assertEquals(Arrays.asList(2, 2, 3, 3), 
				PrimeFactors.getList(36));
	}
	
	@Test
	public void test1540() {
		assertEquals(Arrays.asList(2, 2, 5, 7, 11), 
				PrimeFactors.getList(1540));
	}
}

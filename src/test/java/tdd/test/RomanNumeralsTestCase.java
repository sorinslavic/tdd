package tdd.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RomanNumeralsTestCase {

	@Test
	public void testOne() {
		assertEquals("I", RomanNumerals.get(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals("II", RomanNumerals.get(2));
	}
	
	@Test
	public void testThree() {
		assertEquals("III", RomanNumerals.get(3));
	}
	
	@Test
	public void testTen() {
		assertEquals("X", RomanNumerals.get(10));
	}
	
	@Test
	public void testTwenty() {
		assertEquals("XX", RomanNumerals.get(20));
	}
	
	@Test
	public void testHundred() {
		assertEquals("C", RomanNumerals.get(100));
	}
	
	@Test
	public void testFive() {
		assertEquals("V", RomanNumerals.get(5));
	}
	
	@Test
	public void testNine() {
		assertEquals("IX", RomanNumerals.get(9));
	}
	
	@Test
	public void test1996() {
		assertEquals("MCMXCVI", RomanNumerals.get(1996));
	}
}

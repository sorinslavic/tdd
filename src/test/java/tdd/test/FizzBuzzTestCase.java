package tdd.test;

import static org.testng.Assert.assertEquals;
import static tdd.test.FizzBuzz.say;

import org.testng.annotations.Test;

public class FizzBuzzTestCase {

	@Test
	public void testOne() {
		assertEquals("1", say(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals("2", say(2));
	}
	
	@Test
	public void testThree() {
		assertEquals("Fizz", say(3));
	}
	
	@Test
	public void testFive() {
		assertEquals("Buzz", say(5));
	}
	
	@Test
	public void testSix() {
		assertEquals("Fizz", say(6));
	}
	
	@Test
	public void testTen() {
		assertEquals("Buzz", say(10));
	}

	@Test
	public void testFiteen() {
		assertEquals("FizzBuzz", say(15));
	}
}

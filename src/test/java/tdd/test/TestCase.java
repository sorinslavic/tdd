package tdd.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void testMe() {
		assertEquals(1, 1);
	}
	
	@Test
	public void testSuccess() {
		assertEquals("tata", "tata");
	}
	
}

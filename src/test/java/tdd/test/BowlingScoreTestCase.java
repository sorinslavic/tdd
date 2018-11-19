package tdd.test;

import static org.testng.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tdd.test.testng.TestCaseListener;

public class BowlingScoreTestCase {

	Game game;

	@BeforeMethod
	public void init() {
		game = new Game();
	}
		
	@Test
	public void testAllZero() {
		rollMany(20, 0);
	
		assertEquals(0, game.score());
	}
	
	@Test
	public void testJustOne() {
		game.roll(1);
		rollMany(19, 0);
	
		assertEquals(1, game.score());
	}
	
	@Test
	public void oneSpare() {
		game.roll(3);
		game.roll(7); // spare
		game.roll(4);
		
		rollMany(17, 0);
	
		assertEquals(18, game.score());
	}
	
	@Test
	public void oneRandom() {
		game.roll(1);
		game.roll(7); // spare
		game.roll(3);
		game.roll(5);
		
		rollMany(16, 0);
	
		assertEquals(16, game.score());
	}
	
	@Test
	public void oneStrike() {
		game.roll(10); // strike
		game.roll(3); 
		game.roll(4);
		
		rollMany(17, 0);
	
		assertEquals(24, game.score());
	}
	
	@Test
	public void perfectGame() {		
		rollMany(12, 10);
	
		assertEquals(300, game.score());
	}
	
	public void rollMany(int n, int pins) {
		for (int i = 0; i < n; i ++) {
			game.roll(pins);
		}
	}
}

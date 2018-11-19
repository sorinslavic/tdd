package tdd.test;

public class Game {

	int i = 0;
	int[] rolls = new int[21];
	
	public void roll(int pins) {
		rolls[i ++] = pins;
		
	}
	
	public int score() {
		int score = 0;
		
		int roll = 0;
		for (int frame = 0; frame < 10; frame ++) {
			if (isStrike(roll)) {
				score += 10 + rolls[roll+1] + rolls[roll+2];				
				roll ++;
				continue;
			}			
			if (isSpare(roll)) {
				score += 10 + rolls[roll+2];
			} else 
				score += rolls[roll] + rolls[roll + 1];
			
			roll = roll + 2;
		}
		
		return score;
	}
	
	public boolean isStrike(int roll) {
		return rolls[roll] == 10;
	}
	
	public boolean isSpare(int roll) {
		return rolls[roll] + rolls[roll+1] == 10;
	}
}

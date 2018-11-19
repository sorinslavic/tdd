package tdd.test;

public class RomanNumerals {
	
	static int[] arabics = 
		{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	static String[] romans = 
		{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};

	public static String get(int arabic) {		
		String roman = "";
		
		for (int i = 0; i < arabics.length; i ++) {
			while (arabic >= arabics[i]) {
				roman += romans[i];
				arabic = arabic - arabics[i];
			}
		}
				
		return roman;
	}
}

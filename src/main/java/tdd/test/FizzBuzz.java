package tdd.test;

public class FizzBuzz {

	public static String say(int n) {
		String sayWhat = String.valueOf(n);
		if (divisible(n, 3))
			sayWhat = "Fizz";

		if (divisible(n, 5))
			sayWhat = "Buzz";

		if (divisible(n, 15))
			sayWhat = "FizzBuzz";
		
		return sayWhat;
	}
	
	private static boolean divisible(int n, int divisor) {
		return n % divisor == 0;
	}
}

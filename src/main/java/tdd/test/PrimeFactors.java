package tdd.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	public static List<Integer> getList(int n) {
		if (n == 0)
			throw new IllegalArgumentException("The value is not supported");
		
		List<Integer> primeFactors = new ArrayList<Integer>();
		
		if (n > 1) {
			for (int k = 2; n > 1; k ++) {
				while (n % k == 0) {
					primeFactors.add(k);
					n = n / k;
				}
			}
			
		}
			
		return primeFactors;
	}

}

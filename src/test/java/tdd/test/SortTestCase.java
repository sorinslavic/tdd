package tdd.test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;
import static tdd.test.SortUtil.sort;

import org.testng.annotations.Test;

public class SortTestCase {

	@Test
	public void sortNullArray() {
		assertArrayEquals(null, sort(null));
	}
	
	@Test
	public void sortOneElement() {
		assertArrayEquals(new int[] {1}, 
				sort(new int[] {1}));		
	}
	
	@Test
	public void sortTwoInOrder() {
		assertArrayEquals(new int[] {1, 2}, 
				sort(new int[] {1, 2}));
	}
	
	@Test
	public void sortTwoReversed() {
		assertArrayEquals(new int[] {1, 2}, 
				sort(new int[] {1, 2}));		
	}
	
	@Test
	public void sortThreeInOrder() {
		assertArrayEquals(new int[] {1, 2, 3}, 
				sort(new int[] {1, 2, 3}));
	}
	
	@Test
	public void sortThreeLastTwoReversed() {
		assertArrayEquals(new int[] {1, 2, 3}, 
				sort(new int[] {1, 3, 2}));		
	}
	
	@Test
	public void sortThreeFirstTwoReversed() {
		assertArrayEquals(new int[] {1, 2, 3}, 
				sort(new int[] {2, 1, 3}));		
	}
		
	@Test
	public void sortThreeReversed() {	
		assertArrayEquals(new int[] {1, 2, 3}, 
				sort(new int[] {3, 2, 1}));
	}
	
	@Test
	public void sortAllTheSame() {
		assertArrayEquals(new int[] {1, 1, 1}, 
				sort(new int[] {1, 1, 1}));	
	}
	
	@Test
	public void sortComplexArray() {		
		assertArrayEquals(new int[] {1, 1, 2, 3, 4, 5, 5, 5, 8, 9, 10}, 
				sort(new int[] {5, 10, 1, 3, 2, 1, 4, 5, 5, 8, 9}));
	}
}

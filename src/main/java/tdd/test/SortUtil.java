package tdd.test;

public class SortUtil {
	
	public static int[] sort(int[] elements) {
		if (elements == null) {
			return null;
		}
				
		boolean changed = true;
		while (changed) {
			changed = false;
			for (int i = 0; i < elements.length - 1; i ++) {
				if (elements[i] > elements[i+1]) {
					int aux = elements[i+1];
					elements[i+1] = elements[i];
					elements[i] = aux;
					
					changed = true;
				}
			}
		}
		
		return elements;
	}
}

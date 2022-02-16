package ch2;

public class Alg2_6 {
	static void quicksort(int low, int high) {
		int pivotpoint;
		
		if(high > low) {
			partition(low,high,pivotpoint);
		}
	}
}

package ch1;

public class Alg1_5 {
	static int binsearch(int[] S, int x) {
		//원래 매개변수로 받는 값들
		int n = S.length;
		int location;
		
		int low,high, mid;
		
		low = 0; high = n; // index 시작이 0이므로 low도 0으로 바꿈.
		location = 0;
		while(low<=n && location == 0) {}
		
		return location;
	}
	
	public static void main(String[] args) {
		int[] S = {14,4,2,61,32,7,1,87};
		System.out.println();
	}
}

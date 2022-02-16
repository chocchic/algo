package ch1;

public class Alg1_3 {
	static int[] exchange(int[] S) {
		int i,j;
		for(i = 0;i<S.length-1;i++) {
			for(j=i+1;j<S.length;j++) {
				if(S[j] < S[i]) {
					int temp = S[j];
					S[j] = S[i];
					S[i] = temp;
				}
			}
		}
		
		return S;
	}
	
	public static void main(String[] args) {
		int[] S = {3,67,1,13,215,111,51};
		int[] changedS = exchange(S);
		for(int s : changedS) {
			System.out.print(s + " ");
		}
	}
}

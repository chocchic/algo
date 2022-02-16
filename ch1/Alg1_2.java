package ch1;

public class Alg1_2 {
	// int n은 S.length로 받을수 있기 때문에 따로 받지 않았음
	static int sum(int[] S) {
		int index = 0 ;
		int result = 0;
		
		for(; index<S.length;index++) {
			result +=S[index];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] S = {1,2,3,4,5,6,7,8,9};
		System.out.println(sum(S));
	}
}

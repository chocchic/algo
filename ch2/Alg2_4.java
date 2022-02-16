package ch2;

public class Alg2_4 {
//	static int[] S = {27,10,12,20,25,13,15,22};
//	static int[] S = {12,25,13,45,26,3,1,46,10,0};
	static int[] S = {98,34,21,52,5,8,24,76};
	static void mergesort2(int low, int high) {
		int mid;
		
		if(low < high) {
			mid = (low+high)/2;
			mergesort2(low,mid);
			mergesort2(mid+1,high);
			merge2(low,mid,high);
		}
	}
	
	static void merge2(int low, int mid, int high) {
		int i = low;
		int j = mid +1;
		int k = 0;
		int[] U = new int[high - low +1];
		while(i<= mid && j <= high) {
			if(S[i] < S[j]) {
				U[k] = S[i];
				i++;
			}else {
				U[k] = S[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			for(;j<=high;j++) {
				U[k++] = S[j];
			}
		}else {
			for(;i<=mid;i++) {
				U[k++] = S[i];
			}
		}
		for(int u = 0;u<U.length;u++) {
			S[low++] = U[u];
		}
	}
	public static void main(String[] args) {
		mergesort2(0,S.length-1);
		for(int s : S) {
			System.out.print(s + " ");
		}
	}
}

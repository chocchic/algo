package ch2;

import java.util.Arrays;

public class Alg2_2 {
	static void mergesort(int n, int[] S) {
		if(n > 1) {
			int h = n/2;
			int m = n - h;
			int[] U = Arrays.copyOfRange(S,0,h);
			int[] V = Arrays.copyOfRange(S,h,n);
			mergesort(h,U);
			mergesort(m,V);
			merge(h,m,U,V,S);
		}
	}
	static void merge(int h, int m, int[] U, int[] V, int S[]) {
		int i,j,k;
		i=0;j=0;k=0; // 의사코드와 다르게 0 시작(java의 배열은 0부터 시작하므로)
		while(i<h && j<m) { // 0시작이고, h와 m은 각각 배열 U와 V의 길이를 의미하기때문에 h와 m보다 i와 j가 작을 때까지만 반복문
			if(U[i] < V[j]) {
				S[k] = U[i];
				i++;
			}else {
				S[k] = V[j];
				j++;
			}
			k++;
		}
		if(i>h) {
			for(;j<m;j++) {
				S[k++] = V[j];
			}
		}else {
			for(;i<m;i++) {
				S[k++] = U[i];
			}
		}
			
	}
	public static void main(String[] args) {
		int[] S = {27,10,12,20,25,13,15,22};
		mergesort(S.length,S);
		for(int s : S) {
			System.out.print(s + " ");
		}
		
	}
}

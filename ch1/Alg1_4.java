package ch1;

public class Alg1_4 {
	static int[][] matrixmult(int n, int[][] A, int[][] B) {
		int[][] C = new int[n][n];
		int i,j,k;
		
		for(i = 0;i<n;i++) {
			for(j = 0;j<n;j++) {
				C[i][j] = 0;
				for(k = 0;k<n;k++) {
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		return C;
	}
	
	public static void main(String[] args) {
		int[][] A = {{2,3},{4,1}};
		int[][] B = {{5,7},{6,8}};
		int[][] C = matrixmult(2, A,B);
		for(int[] c : C) {
			for(int cc : c) {
				System.out.print(cc+" ");
			}
			System.out.println();
		}
	}
}

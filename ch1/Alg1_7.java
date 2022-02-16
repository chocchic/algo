package ch1;

public class Alg1_7 {
	static int fib2(int n) {
		int i;
		int[] f = new int[n+1];
		
		f[0] = 0;
		if(n>0) {
			f[1]=1;
			for(i=2;i<=n;i++) {
				f[i] = f[i-1]+f[i-2];
			}
		}
		return f[n];
	}
	public static void main(String[] args) {
		System.out.println(fib2(10));
	}
}

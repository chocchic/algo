package ch2;

public class Alg2_1 {
	static int x = 18;
	static int[] S = {10,12,13,14,18,20,25,27,30,35,40,45,47};
	
	static int location(int low, int high) {
		int mid ;
		if(low > high) { return 0;}
		else {
			mid = (low+high)/2;
		}
		if(x==S[mid]) {return mid;}
		else if(x <S[mid]) {
			return location(low,mid-1);
		}else { return location(mid+1,high);}
		
	}
	public static void main(String[] args) {
		System.out.println(location(0,12));
	}
}

package sw1216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW1216_V2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = 10;
		char[ ][ ] arr = new char[100][100];
		
		for(int tcn = 1; tcn<=tc; tcn++) {
			br.readLine(); // consume
			for(int ir = 0; ir<arr.length; ir++) {
				arr[ir] = br.readLine().toCharArray();
			}
			
			int maxlength = searchPalindrome(arr);
			System.out.printf("#%d %d\n", tcn, maxlength);			
		}//100 x 100
	}

	private static int searchPalindrome(char[][] arr) {
		int max = 0; // 94
		for(int ir=0;  ir<arr.length; ir++) {
			int maxline=isPalindrome(arr[ir]);
			if(max<maxline) max = maxline;
		}
		
		for(int ic = 0; ic<arr.length; ic++) {
			for(int ir = 0; ir<arr.length; ir++) {
				int maxline = isPalindrome2(arr, ic, ir);
				if(max<maxline) max = maxline;
			}
		}
		return max;
	}
	
	
	static int palindromSize(char [] cs, int L, int R ) {
		int len = R - L + 1;
		while(L < R ) {
			if ( cs[L] == cs[R]) {
				L++; 
				R--; 
				 
			} else {
				return -1;
			}
		}
		return len;
	}
	static int isPalindrome(char[] cs) {
		int size= cs.length; // AB... CA
		while ( size > 1 ) {
			for( int i = 0 ; i + size <= cs.length ; i ++ ) {
				int L = i, R=L + size-1;
				int len = palindromSize(cs, L, R);
				if ( len != -1) {
					return len;
				}
			}
			size --;
		}
		return 1;
	}	

	private static int isPalindrome2(char[][] arr, int ic, int ir) {
		int maxlength = 0;
		char [] cs = new char [arr.length];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = arr[i][ic];
		}
		return isPalindrome(cs);
		
	}

}













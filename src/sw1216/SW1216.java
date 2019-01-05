package sw1216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW1216 {

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
	
	
	static int isPalindrome(char[] cs) {
		int maxlength = 0;
		String s = new String(cs);
		
		for(int i=0; i<s.length(); i++) {
			for(int j = i; j<=s.length(); j++) {
				StringBuffer sb = new StringBuffer();
				sb.append(s.substring(i, j));
				if(s.substring(i,j).equals(sb.reverse().toString())) {
					if(sb.length()>maxlength)maxlength = sb.length();
				}
			}
		}
		return maxlength;
	}	

	private static int isPalindrome2(char[][] arr, int ic, int ir) {
		int maxlength = 0;
		char [] cs = new char [arr.length];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = arr[i][ic];
		}
		return isPalindrome(cs);
		/*
		String s =new String(arr);
		for(int i=0; i<s.length(); i++) {
			for(int j = i; j<=s.length(); j++) {
				StringBuffer sb = new StringBuffer();
				sb.append(s.substring(i, j));
				if(s.substring(i,j).equals(sb.reverse().toString())) {
					if(sb.length()>maxlength)maxlength = sb.length();
				}
			}
		}		
		return maxlength;
		*/
	}

}













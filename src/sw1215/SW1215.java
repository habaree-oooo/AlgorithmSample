package sw1215;

import java.util.Scanner;

public class SW1215 {
	public static void main(String[] args) {
		System.setIn(SW1215.class.getResourceAsStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for( int tc =1 ; tc<= T ;tc++) {
			int len= sc.nextInt();
			char [][] txt = new char[8][];
			for( int ir=0 ; ir < 8 ; ir++) {
				String line = sc.next();
				txt[ir] = line.toCharArray();
			}
			int cnt = countPalindrome(txt, len);
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}

	private static int countPalindrome(char[][] txt, int len) {
		int cnt = 0;
		for (int ir = 0; ir < txt.length; ir++) {
			// [ic, ic+len] 0,4 ~ 1,5
			// [ 0, 1, 2, 3]
			for (int ic = 0; ic <= txt[ir].length - len; ic++) {
				if ( isPal(txt[ir], ic, ic+len-1)) {
					cnt++;
				}
			}
		}
		
		for (int ic = 0; ic < txt[0].length; ic++) {
			for (int ir = 0; ir <= txt.length - len; ir++) {
				if ( isPal2(txt, ic, ir, ir+len-1)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	static boolean isPal(char[] arr, int is, int ie) {
		// [ C B C A  
		while ( is < ie ) { 
			if ( arr[is] != arr[ie]) {
				return false;
			}
			is++;
			ie--;
		}
		return true;
	}
	static boolean isPal2(char[][] arr, int ic, int is, int ie) {
		while ( is < ie ) {
			if ( arr[is][ic] != arr[ie][ic]) {
				return false;
			}
			is++;
			ie--;
		}
		return true;
	}
}

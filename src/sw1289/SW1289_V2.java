package sw1289;

import java.util.Scanner;

public class SW1289_V2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for( int tc=1; tc <= T ; tc++) {
			String bits = sc.next();
			int cnt = count(bits);
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}

	static int count(String s) {
		char [] bits = s.toCharArray();
		char cur = '0';
		int idx= 0;
		int cnt = 0;
		while( idx < bits.length ) {
			if ( cur != bits[idx] ) {
				cnt ++;
				cur = bits[idx];
			}
			idx++;
		}
		return cnt;
	}
}

package sw6190;

import java.util.Scanner;

/**
 * 12222333 true
 * 2222393 false
 * 
 *     2349     R
 *        ^     9
 *      234%10  4
 *       23%10  3
 *        7%10  2
 *        0
 * 
 * @author Administrator
 *
 */
public class SW6190 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for( int tc=1; tc<=T ; tc++) {
			int N = sc.nextInt();
			int [] num = new int[N];
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			
			// 조사시작
			int max = -1;
			for (int i = 0; i < num.length; i++) {
				for (int j = i+1; j < num.length; j++) {
					int value = num[i]*num[j]; //  Ai x Aj, -1
					value = isAcs(value);
					if ( value > max ) {
						max = value;
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
	
	static int isAcs(int val) {
		int R = val % 10; // 1의 자리부터
		int v = val / 10; // 1의 자리 날림
		while( v >= 1) {
			if(v%10 > R) {
				return -1;
			}
			R= v % 10;
			v /= 10;
		}
		return val;
	}
}

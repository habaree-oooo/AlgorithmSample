package sw1206;

import java.util.Scanner;

public class SW1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for( int tc = 1 ; tc <= T ; tc++) {
			int N = sc.nextInt(); // 
			int [] buildings = new int[N];
			for( int k = 0 ; k < N ; k ++) {
				buildings[k] = sc.nextInt();
			}
			
			int cnt = countVisibleStairs(buildings);
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
	static int countVisibleStairs(int [] buildings) {
		
		int cnt = 0 ; // 1
		for( int i = 2; i < buildings.length-2; i++) {
			int leftH = Math.max(buildings[i-1], buildings[i-2]); // 3
			int rightH = Math.max(buildings[i+1], buildings[i+2]); // 5
			int maxH = Math.max(leftH, rightH); // 5
			int diffH = buildings[i] - maxH; // 6 - 5 = 1
			if ( diffH > 0) {
				cnt += diffH;
			}
		}
		return cnt;
	}
}

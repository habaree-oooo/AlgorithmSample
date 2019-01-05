package sw6485;

import java.util.Scanner;

/**
 *    s, e
 * N개 
 * int [][] buses = new int [N][2]; N*2 
 * 
 * start         end
 * buses[i][0] ~ buses[i][1] 
 * 
 * 1 : [1, 3] no 
 * 2 : [2, 5] ok
 * 3 : [6, 7] no
 * 4 : [1, 4] no
 * 
 * C3 = 3 : 3
 * C5 = 5 : 1
 * 
 * 
 * @author Administrator
 *
 */
public class SW6485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for( int tc=1; tc <= T ; tc++) {
			int N = sc.nextInt(); // 버스 노선의 갯수
			int [][] buses = new int[N][2];
			for( int i = 0 ; i < N ; i++) {
				buses[i][0] = sc.nextInt();
				buses[i][1] = sc.nextInt();
			}
			// 조회할 버스정류장
			int P = sc.nextInt();
			System.out.print("#" + tc);
			for( int k = 0 ; k < P ; k++ ) {
				int pnum = sc.nextInt();
				int cnt = countBusstop(buses, pnum);
				System.out.print(" " + cnt);
			}
			System.out.println();
		}
	}

	static int countBusstop(int[][] buses, int pnum) {
		int cnt = 0;
		for (int i = 0; i < buses.length; i++) {
			if ( buses[i][0] <= pnum && pnum <= buses[i][1] ) {
				cnt++;
			}
		}
		return cnt;
	}
}

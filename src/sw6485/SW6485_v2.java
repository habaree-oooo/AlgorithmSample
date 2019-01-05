package sw6485;

import java.util.Scanner;

/**
 * 
 *  C[j] = K대노선이 정차
 *  
 *  C[j+1] = C[j] + Bus.L - Bus.R
 *  
 *  
 * 1 : [1, 3] no 
 * 2 : [2, 5] ok
 * 3 : [6, 7] no
 * 4 : [1, 4] no
 * 
 *   1 2 3 4 5 6 7 8 9
 *   [   ]
 *     [     ]
 *             [ ]
 *   [     ]
 *c1 2
 *c2   3
 *c3   3
 *c4   2 = c3 -1
 *c5   1 = c4 - 1
 *c6   1 = c5 + 1 - 1
 *c7   1 = c6
 *c8   0 = c7 - 1  
 * @author Administrator
 *
 */
public class SW6485_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for( int tc=1; tc <= T ; tc++) {
			int N = sc.nextInt(); // 버스 노선의 갯수
			// int [][] buses = new int[N][2];
			int [] start = new int[50001];
			int [] end   = new int[50001];
			
			for( int i = 0 ; i < N ; i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				start[s] ++;
				end [e] ++; 
			}
			
			int [] C = new int[50001]; // [0,... 5000]
			C[0] = 0;
			for( int j = 0 ; j < C.length-1 ; j++) {
				C[j+1] = C[j] - end[j] + start[j+1];
			}
			// 조회할 버스정류장
			int P = sc.nextInt();
			System.out.print("#" + tc);
			for( int j = 0 ; j < P ; j++ ) {
				int pnum = sc.nextInt();
				int cnt = C[pnum];
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

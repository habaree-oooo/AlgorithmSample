package sw1860;

import java.util.Scanner;

/**
 * 진기의 최고급 붕어빵
 * D3-1860
 * https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LsaaqDzYDFAXc&categoryId=AV5LsaaqDzYDFAXc&categoryType=CODE
 * 
 * N(고객 방문수), M(초), K(개)
 * 10 8 20
 * 6 12 12 13 21 45 45 45 45
 * [0, 0,0,0,0, 1, 1, 1, 1, 1,1,1 3, 4, 4, 4, 4,4,4,4..., 5...]
 * 0...7
 * 8 20
 * 9...15
 * 16 40
 * 
 * @author chmin.seo 
 *
 */
public class SW1860 {

	static String TRUE = "Possible";
	static String FALSE= "Impossible";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for( int tc=1 ; tc<=T ; tc++) {
			int N = sc.nextInt(); // 고객수
			int M = sc.nextInt(); // seconds
			int K = sc.nextInt(); // qtt
			int [] visit = new int[11112]; // [0~11111] secs
			for(int i = 0 ; i < N ; i ++) {
				int sec = sc.nextInt();
				visit[sec]++;
			}
			// 누적값으로 변경
			/*int acc = 0;
			for (int i = 0; i < visit.length; i++) {
				visit[i] += acc;
				//acc = visit[i];
			}*/
			
			String result = solve(visit, M, K);
			System.out.printf("#%d %s\n", tc, result);
			
		}
	}

	static String solve(int[] customers, int M, int K) {
		int sec = 0;
		int breads = 0;
		for (int i = 0; i < customers.length; i++) {
			if (i != 0 && i % M == 0 ) {
				breads += K;
			}
			if(customers[i] > breads ) {
				return FALSE;
			}
		}
		return TRUE;
	}
}


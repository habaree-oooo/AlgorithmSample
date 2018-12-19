package p1208;

import java.util.Arrays;
import java.util.Scanner;

public class SW1208_V2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int len = 100;
		int [] bricks = new int [len];
		for( int tc = 1; tc <= T ; tc++ ) {
			int dump = sc.nextInt();
			// len = sc.nextInt(); // 테스트할때만
			// bricks = new int[len]; // 테스트할때만
			for( int i = 0 ; i < len ; i ++ ) {
				int value = sc.nextInt();
				bricks[i] = value;
			}
			int hDiff = heightDiff(bricks, dump);
			System.out.printf("#%d %d\n", tc, hDiff);
		}
	}

	static int heightDiff(int[] bricks, int dump) {
		Arrays.sort(bricks);
		
		int L = 0;
		int R = bricks.length-1;
		
		for( int i =  0; i < dump ; i++ ) {
			int diff = diff(bricks, L, R); 
			if( diff <= 1) {
				return diff;
			}
			
			bricks[L]++;
			bricks[R]--;
			L = swapL(bricks, L);
			R = swapR(bricks, R);
		}
		
		return bricks[R] - bricks[L];
	}

	static int swapL(int[] bricks, int idx) {
		if ( bricks[idx] <= bricks[idx+1] ) {
			return 0;
		} else {
			return idx + 1;
		}
	}
	
	static int swapR(int[] bricks, int idx) {
		if ( bricks[idx-1] <= bricks[idx] ) {
			return bricks.length-1;
		} else {
			return idx - 1;
		}
	}

	static int diff(int[] bricks, int L, int R) {
		return bricks[R] - bricks[L];
	}
	
}

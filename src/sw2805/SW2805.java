package sw2805;

import java.util.Scanner;
/**
 * 
 * 
 * q = [(2,3), (3,2), (3,4), (4,3), (), (), ()] 
 * while ( q.size() > 1 ) {
 *     int [] p = p.dequq();
 *     
 *     int [] ngb = // (2,3), (3,2), (3,4), (4,3)
 *     for( n : nbg) {
 *        q.push(n);    
 *     } 
 * }
 * @author Administrator
 *
 */
public class SW2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for( int tc = 1 ; tc <= T ; tc++) {
			int N = sc.nextInt();
			char [][] map = new char[N][];
			for( int i = 0 ; i < N ; i ++ ) {
				map[i] = sc.next().toCharArray();
			}
			
			// ir : 0 => [N/2, N/2]
			// ir : N-ir-1 =>
			// ir : 1 => [N/2-1, N/2+1]
			// ir :
			int sum = 0;
			for ( int ir = 0 ; ir < N/2 ; ir ++ ) {
				int up = ir;
				int down = N - ir - 1 ;
				int L = N/2 - ir;
				int R = N/2 + ir;
				sum += rowsum(map, up, L, R);
				sum += rowsum(map, down, L, R);
			}
			
			sum += rowsum(map, N/2, 0, N-1);
			System.out.printf("#%d %d\n", tc, sum);
		}
	}

	static int rowsum(char[][] map, int ir, int L, int R) {
		int sum = 0;
		// '9' -> 78
		for( int ic = L ; ic <= R ; ic++) {
			sum += (map[ir][ic]-'0');
		}
		return sum;
	}
}

package sw1493;

import java.util.Scanner;

/**
 *  &(1) = (1,1), 
 *  &(3) = 
 *  (2,1), 
 *  &(5) = (2,2), &(25) = (4,4)
 * @author Administrator
 *
 */
public class SW1493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for( int tc = 1 ; tc <= T ; tc++ ) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			//  #(&(p)+&(q))
			int [] cp = indexToCoord(p);
			int [] cq = indexToCoord(q);
			int x = cp[0] + cq[0];
			int y = cp[1] + cq[1]; 
			int idx = coordToIndex(x, y);
			System.out.printf("#%d %d\n", tc, idx);
		}
	}
	/**
	 *  #(1,1) = 1, 
	 *  #(2,1)=3, 
	 *  #(2,2) = 5, 
	 *  #(4,4) = 25
	 *  
	 *  y         idx
	 *  --
	 *  1 1+ Σ0   1 
	 *  2 1+ Σ1   2
	 *  3 1 +Σ2   4
	 *  4 1 +Σ3   7  
	 *  
	 *  y : 1 +Σ(y-1) = 
	 *  
	 *  N-1 ( N +1)
	 *  --------
	 *     2
	 *  1에서 n까지 더할때 
	 *  
	 *  n*(n+1) /2 
	 *  
	 *  
	 */
	static int coordToIndex( int x, int y) {
		// (x, y) |x-1|-> (1, y + |x-1| )
		int x0 = x - (x - 1);
		int y0 = y + (x - 1);
		
		int left = 1 + y0*(y0-1)/2;
		
		return left + (x-1);
	}
	
	static int [] indexToCoord(int index ) {
		int x = 1;
		int y = 1;
		while ( true ) {
			int v = x*(x+1)/2; // 1, 3, 6 (1,1), (3,1), (6,1)
			if ( v < index ) {
				x ++;
			} else {
				break;
			}
		}
		// ( x, 1 )
		int idx = coordToIndex(x, y);
		int diff = idx - index; // 
		return new int[] {x - diff, y + diff};
	}
}

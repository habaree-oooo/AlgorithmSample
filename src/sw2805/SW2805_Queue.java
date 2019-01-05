package sw2805;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
public class SW2805_Queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// '_'
		for( int tc = 1 ; tc <= T ; tc++) {
			int N = sc.nextInt();
			char [][] map = new char[N][];
			int  [][] visit = new int[N][N]; 
			for( int i = 0 ; i < N ; i ++ ) {
				map[i] = sc.next().toCharArray();
			}
			
			Queue<int []> queue = new LinkedList<>();
			queue.add(new int[] {N/2, N/2, 0});
			
			int sum = 0;
			// int cnt = 1;
			while ( queue.size() > 0 ) {
				int [] p = queue.poll();
				int ir = p[0], ic = p[1];
				sum += map[ir][ic] - '0';
				map[ir][ic] = '_'; // 처리했음
				visit[ir][ic] = 1;
				List<int []> adj = findAdj(map, visit, p);
				queue.addAll(adj);
//				cnt += adj.size();
//				System.out.println(Arrays.toString(p));
//				System.out.println("====");
//				adj.stream().forEach(v->System.out.println(Arrays.toString(v)));
//				System.out.println();
			}
			
			System.out.printf("#%d %d\n", tc, sum);
		}
	}

	private static List<int[]> findAdj(char[][] map, int[][] visit, int[] p) {
		int N = map.length;
		int ir = p[0]; // 3 p [ x, x]
		int ic = p[1]; // 3
		int depth = p[2];
		if ( depth == N/2) {
			// return new ArrayList<>();
			return Collections.emptyList();
		}
		List<int []> adj = new ArrayList<>();
		if ( ir - 1 >= 0 && visit[ir-1][ic] != 1 ) {
			adj.add(new int[] {ir-1, ic, depth+1});
			visit[ir-1][ic] = 1;
		}
		if ( ir + 1 < map.length && visit[ir+1][ic] != 1 ) {
			adj.add(new int[] {ir+1, ic, depth+1});
			visit[ir+1][ic] = 1;
		}
		if ( ic-1 >= 0 && visit[ir][ic-1] != 1 ) {
			adj.add(new int[] {ir, ic -1, depth+1});
			visit[ir][ic-1] = 1;
		}
		if ( ic+1 < map[0].length && visit[ir][ic+1] != 1 ) {
			adj.add(new int[] {ir, ic +1, depth+1});
			visit[ir][ic+1] = 1;
		}
		return adj;
	}
	
}

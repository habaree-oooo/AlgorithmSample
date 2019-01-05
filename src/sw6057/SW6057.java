package sw6057;

import java.util.Scanner;

public class SW6057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for( int tc =1; tc<=T ; tc++) {
			int N = sc.nextInt();// vertext(����)�� ���� 1, 2, 3, ..N
			int [][] g = new int[N][N]; // 0 1 2
					
			int M = sc.nextInt();// edge(����)�� ����
			for (int i = 0; i < M; i++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				g[x][y] = 1;
				g[y][x] = 1;
			}
			
			int cnt = 0;
			// ��� ������ �ִ� ( i, j, k ) (��, i < j < k )�� �ﰢ���̶�� ����.
			for( int i = 0 ; i < g.length ; i ++) {
				// g[i] : A
				for( int j = i+1; j < g.length; j ++ ) {
					// g[j] : B
					if ( g[i][j] == 0) {
						continue;
					}
					// (i,j) 
					for(int k = j +  1; k < g.length ; k++) {
						// g[k] : C
						if ( g[j][k] == 0 ) {
							continue;
						}
						// (j, k)
						if ( g[i][k] == 1 ) {
							cnt ++;
						}
					}
				}
			} // end
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
}

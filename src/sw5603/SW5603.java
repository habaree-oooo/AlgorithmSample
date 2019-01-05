package sw5603;

import java.util.Scanner;

public class SW5603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcn = sc.nextInt();
		for(int tc=1; tc<=tcn; tc++) {
			int n = sc.nextInt();
			int[ ] dummy = new int[n];
			int total = 0;
			for(int i=0; i<n; i++) {
				dummy[i] = sc.nextInt();
				total += dummy[i];
			}
			
			int height = total / n; //
			int mvcnt = 0;
			for (int i = 0; i < dummy.length; i++) {
				if ( dummy[i] > height ) {
					mvcnt += dummy[i] - height;
				}
			}
			System.out.printf("#%d %d\n", tc, mvcnt);
		}
	}

}

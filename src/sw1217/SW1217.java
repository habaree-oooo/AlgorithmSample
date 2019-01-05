package sw1217;

import java.util.Scanner;

public class SW1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int i=0; i<T; i++) {
			int tcnum=Integer.parseInt(sc.nextLine());
			String[ ] nm=  sc.nextLine().split(" "); 
			int n = Integer.parseInt(nm[0]);
			int e = Integer.parseInt(nm[1]);
			int result = (int)Math.pow(n, e);
			System.out.println("#"+tcnum+" "+result);
		}
		
		
				

	}

}

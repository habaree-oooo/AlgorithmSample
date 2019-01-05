package sw1209;

import java.util.Scanner;

public class SW1209 {

	public static void main(String[] args) {
		int T = 10;
		//System.setIn(SW1209.class.getResourceAsStream("input.txt"));
		Scanner sc = new Scanner(System.in); //
		
		for( int i = 1 ; i <= T ; i++) {
			int tc = sc.nextInt();
			int [][] num = new int[100][100];
			for (int ir = 0; ir < num.length; ir++) {
				for (int ic = 0; ic < num.length; ic++) {
					num[ir][ic] = sc.nextInt();
				}
			}
			
			int max = maxSum(num);
			System.out.printf("#%d %d\n", tc, max);
		}
	}

	private static int maxSum(int[][] num) {
		// row
		int maxSum = Integer.MIN_VALUE;
		
		for (int ir = 0; ir < num.length; ir++) {
			int sum = 0;
			for (int ic = 0; ic < num[0].length; ic++) {
				sum += num[ir][ic];
			}
			if ( sum > maxSum ) {
				maxSum = sum;
			}
		}
		
		//col
		for (int ic = 0; ic < num[0].length; ic++) {
			int sum = 0;
			for (int ir = 0; ir < num.length; ir++) {
				sum += num[ir][ic];
			}
			if ( sum > maxSum ) {
				maxSum = sum;
			}
		}
		
		int ir=0,ic=0;
		int sum = 0;
		for( int i = 0 ; i < num.length ; i++) {
			sum += num[ir][ic];
			ir+= 1;
			ic+= 1;
		}
		if ( sum > maxSum ) {
			maxSum = sum;
		}
		
		ir=num.length-1;
		ic=0;
		sum =0;
		for( int i = 0 ; i < num.length ; i++) {
			sum += num[ir][ic];
			ir-= 1;
			ic+= 1;
		}
		if ( sum > maxSum ) {
			maxSum = sum;
		}
		return maxSum;
	}

}

package p1208;

import java.util.Arrays;
import java.util.Scanner;

public class SW1208_V1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int boxLen = 100;
		for( int tc = 1; tc <= T ; tc++ ) {
			int dump = sc.nextInt();
			int [] box = new int[boxLen];
			for(int i = 0 ; i < box.length ; i++ ) {
				box[i] = sc.nextInt(); 
			}
			
			int heighDiff = dumping(box, dump);
			System.out.printf("#%d %d\n",tc, heighDiff);
		}
	}

	static int dumping(int[] box, int dump) {
		
		for( int i = 0 ; i < dump ; i ++) {
			Arrays.sort(box);
			int diff = box[box.length-1] - box[0];
			if ( diff <= 1) {
				return diff;
			}
			box[0]++;
			box[box.length-1]--;
		}
		Arrays.sort(box);
		return box[box.length-1] - box[0];
	}
}

package sw1213;

import java.util.Scanner;

public class SW1213 {
	
	public static void main(String[] args) {
		// is
		// thisissisiter
		//   
		// String s = "thdadisismskdkd";
		//                    ^
		int T = 10;
		// System.setIn(SW1213.class.getResourceAsStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt(); // 
			String keyword = sc.next();
			String content = sc.next();
			int cnt = 0;
			int offset = 0;
			int idx;
			while ((idx=content.indexOf(keyword, offset)) >= 0 ) {
				cnt++;
				offset = idx + keyword.length();
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}

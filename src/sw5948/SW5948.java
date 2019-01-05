package sw5948;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
7 * 6 * 5 = 210 (중복을 허용하지 않는 경우) <<<
7 * 7 * 7 = 343 ( 중복을 혀용하는 경우)


1 2 3 4 5 6 7

세개의 숫자를 A, B, C 라고 했을때
A를 뽑을 수 있는 경우는 [ 7, 6, 5, 4, 3, 2, 1] 총 7가지
B를 뽑을 수 있는 경우는 [ 7, 6, 5, 4, 3, 2, 1] - [A] 총 6가지
C를 뽑을 수 있는 경우는 [ 7, 6, 5, 4, 3, 2, 1] - [A, B] 총 5가지
A  B  C
7
   6
      5  18
      4  17
      3...
   5
      4   16
      3   15
      2..
   4..

6
5
4
..
 * @author Administrator
 *
 */
public class SW5948 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		int [] num = new int[7]; 
		for( int tc = 1 ; tc <= T ;tc++) {
			for( int k = 0 ; k < num.length ; k++) {
				num[k] = sc.nextInt();
			}
			int fifth = findFifth(num);
			System.out.printf("#%d %d\n", tc, fifth);
		}
	}

	static int findFifth(int[] num) {
		Comparator<Integer> desc = new Comparator<Integer>() {
			/**
			 * return 음수 : o1이 o2보다 먼저 등장해야함!
			 * return 양수 : o2가 o1보다 먼저 등장해야함!
			 * return 0   : 바꿔도 되고 안바꿔도 됨!
			 */
			@Override
			public int compare(Integer o1, Integer o2) { // [ 43, .... 78, ...]
				// o1: 43, o2:78
				int v = o1.intValue() - o2.intValue();
				return -1*v; //내림차순
				// return v; //오름차순
			}
		};
		TreeSet<Integer> val = new TreeSet<>(desc); // 오름차순 내림 차순으로 정렬 
		for( int i = 0 ; i < num.length ; i ++) {
			for( int j = i+1; j < num.length ; j++) {
				for (int k = j+1 ; k < num.length ; k++) {
					val.add(num[i] + num[j] + num[k]);
				}
			}
		}
		val.pollFirst(); // 1
		val.pollFirst(); // 2
		val.pollFirst(); // 3
		val.pollFirst(); // 4
		
		return val.pollFirst();
	}
}

package sw5948;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
7 * 6 * 5 = 210 (�ߺ��� ������� �ʴ� ���) <<<
7 * 7 * 7 = 343 ( �ߺ��� �����ϴ� ���)


1 2 3 4 5 6 7

������ ���ڸ� A, B, C ��� ������
A�� ���� �� �ִ� ���� [ 7, 6, 5, 4, 3, 2, 1] �� 7����
B�� ���� �� �ִ� ���� [ 7, 6, 5, 4, 3, 2, 1] - [A] �� 6����
C�� ���� �� �ִ� ���� [ 7, 6, 5, 4, 3, 2, 1] - [A, B] �� 5����
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
			 * return ���� : o1�� o2���� ���� �����ؾ���!
			 * return ��� : o2�� o1���� ���� �����ؾ���!
			 * return 0   : �ٲ㵵 �ǰ� �ȹٲ㵵 ��!
			 */
			@Override
			public int compare(Integer o1, Integer o2) { // [ 43, .... 78, ...]
				// o1: 43, o2:78
				int v = o1.intValue() - o2.intValue();
				return -1*v; //��������
				// return v; //��������
			}
		};
		TreeSet<Integer> val = new TreeSet<>(desc); // �������� ���� �������� ���� 
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

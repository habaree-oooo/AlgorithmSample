package sw6019;

import java.util.Scanner;

public class SW6019 {
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int tc = 1 ; tc <= T ; tc++) {
            double D = sc.nextInt(); // ������ �Ÿ�
            int A = sc.nextInt(); // ���� A�ӵ�
            int B = sc.nextInt(); // ���� B�ӵ�
            int F = sc.nextInt(); // �ĸ� �ӵ�
             
            int speed = A + B;
            double t = D / speed;
            System.out.printf("#%d %.7f\n", tc, F*t);
        }
    }
}

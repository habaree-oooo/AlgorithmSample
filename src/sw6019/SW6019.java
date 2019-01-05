package sw6019;

import java.util.Scanner;

public class SW6019 {
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int tc = 1 ; tc <= T ; tc++) {
            double D = sc.nextInt(); // 기차간 거리
            int A = sc.nextInt(); // 기차 A속도
            int B = sc.nextInt(); // 기차 B속도
            int F = sc.nextInt(); // 파리 속도
             
            int speed = A + B;
            double t = D / speed;
            System.out.printf("#%d %.7f\n", tc, F*t);
        }
    }
}

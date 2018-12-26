package sw5986;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class Test5986 {

	@Test
	void test() {
		// prime number
		List<Integer> primes  = new ArrayList<>();
		primes.add(2);
		for( int i = 3; i <= 999 ; i+=2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		System.out.println(primes);
		System.out.println(primes.size());
	}
	
	@Test
	public void test_in00 () {
		System.setIn(SW5986_V2.class.getResourceAsStream("in00"));
		SW5986_V2.main(new String[0]);
	}
	
	@Test
	@Ignore
	public void gen_samples() {
		Random r = new Random();
		System.out.println(1000);
		for( int i = 1; i <= 1000 ; i ++) {
			int N = r.nextInt(999-7) + 7;
			System.out.println(N%2 == 0 ? N+1 : N);
		}
	}

	boolean isPrime(int n) { // n = [3, 5, 7, 9, 11 ....] 
		// int div = 3; // 97 % [3, 7..... 95] [1, 97]
		// N = 1231
		// 10 + 1221
		// 1231/2 = 61x
		// N = 101 = 10.xxxxx
		// 2 
		// 3
		// 4
		// 10
		// ..
		// 77
		// 78..
		//
		// 1221 + 10
		int limit = (int) Math.sqrt(n); // 1.7xxxxxxx 
		for( int div = 3; div <= limit ; div+=2 ) {
			if ( n % div == 0 ) {
				return false;
			}
		}
		return true;
	}

}

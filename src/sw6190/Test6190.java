package sw6190;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test6190 {

	@Test
	void test() {
		assertTrue(1 == SW6190.isAcs(1));
		assertTrue(9 == SW6190.isAcs(9));
		
		assertTrue(11 == SW6190.isAcs(11));
		assertTrue(12 == SW6190.isAcs(12));
		assertTrue(19 == SW6190.isAcs(19));
		
		assertTrue(-1 == SW6190.isAcs(70));
		
		for( int v = 90; v < 99; v ++ ) {
			assertTrue(-1 == SW6190.isAcs(v));
		}
	}

}

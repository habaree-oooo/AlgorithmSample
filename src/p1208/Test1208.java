package p1208;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1208 {

	@Test
	void test() {
		System.setIn(SW1208_V1.class.getResourceAsStream("input.txt"));
		SW1208_V1.main(new String[0]);
	}

	@Test
	void test_v2() {
		System.setIn(SW1208_V2.class.getResourceAsStream("input.txt"));
		SW1208_V2.main(new String[0]);
	}
}

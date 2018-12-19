package sw1206;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1206 {

	@Test
	void test() {
		System.setIn(SW1206.class.getResourceAsStream("input.txt"));
		SW1206.main(new String[0]);
	}

}

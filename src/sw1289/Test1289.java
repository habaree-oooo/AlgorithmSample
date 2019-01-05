package sw1289;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Test1289 {

	@Test
	void test() {
		System.setIn(SW1289.class.getResourceAsStream("input.txt"));
		// split("0+") -> "01100011000011111 = [ "11", "11", "11111"]
		SW1289.main(new String[0]);
		assertEquals(30, SW1289.count("01010100010100101100111010100010111111011001011000"));
	}
	
	@Test
	public void test_exp() {
		String [] ones = "011001110".split("0+");
		System.out.println(Arrays.toString(ones));
		assertEquals(4, ones.length);
		assertEquals("1", ones[0]);
		assertEquals("11", ones[1]);
		assertEquals("111", ones[2]);
	}

}

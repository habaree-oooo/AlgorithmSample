package sw1216;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Test1216 {
	@Test
	void test() throws Exception{
		System.setIn(SW1216_V2.class.getResourceAsStream("input.txt"));
		SW1216_V2.main(new String[0]);
	}
	
	@Test
	public void test_isPalindrome() {
		char [] cs = "CABAXXXX".toCharArray();
		assertEquals(4, SW1216.isPalindrome(cs));
	}
	
	@Test
	public void test_v2() {
		// AB [pal].. [pal].. XA
		//    i .... j 
		//    i .... j
		assertEquals(
			3, 
			SW1216_V2.isPalindrome("ABA".toCharArray()));
		
		assertEquals(
				4, 
				SW1216_V2.isPalindrome("ABACBBC".toCharArray()));
		 
	}
}

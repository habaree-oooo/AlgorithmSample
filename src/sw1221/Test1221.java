package sw1221;

import org.junit.jupiter.api.Test;


public class Test1221 {
	@Test
	void test() throws Exception{
		System.setIn(SW1221_V2.class.getResourceAsStream("input.txt"));
		SW1221_V2.main(new String[0]);
	}
	
	
}

package sw1860;

import org.junit.jupiter.api.Test;

public class Test1860 {
	@Test
	public void run() {
		System.setIn(SW1860.class.getResourceAsStream("input.txt"));
		SW1860.main(new String[0]);
	}
}

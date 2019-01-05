package sw2805;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2805 {

	@Test
	public void run() {
		System.setIn(SW2805.class.getResourceAsStream("input.txt"));
		SW2805.main(new String[0]);
	}
	
	@Test
	public void run_queue() {
		System.setIn(SW2805_Queue.class.getResourceAsStream("input.txt"));
		SW2805_Queue.main(new String[0]);
	}
	
}

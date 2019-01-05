package sw1493;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1493 {

	@Test
	public void run() {
		System.setIn(SW1493.class.getResourceAsStream("input.txt"));
		SW1493.main(new String[0]);
	}
	@Test
	void test() {
		assertEquals(1, SW1493.coordToIndex(1, 1));
		assertEquals(7, SW1493.coordToIndex(1, 4));
		assertEquals(25, SW1493.coordToIndex(4, 4));
		assertEquals(21, SW1493.coordToIndex(6,1));
	}
	
	@Test
	void test_idx2coordd() {
		assertArrayEquals(new int[] {2,2}, SW1493.indexToCoord(5));
		assertArrayEquals(new int[] {2,3}, SW1493.indexToCoord(8));
		assertArrayEquals(new int[] {4,4}, SW1493.indexToCoord(25));
		assertArrayEquals(new int[] {1,5}, SW1493.indexToCoord(11));
	}
	

}

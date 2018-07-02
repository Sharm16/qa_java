import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {

	@Test
	public void testBothAbove21() {
		assertEquals(0, HelloWorld.BlackJack(22, 24));
	}
	@Test
	public void testBothNegative() {
		assertEquals(0, HelloWorld.BlackJack(-2, -3));
	}
	@Test
	public void testOneNegative() {
		assertEquals(20, HelloWorld.BlackJack(-1, 20));
	}
	@Test
	public void testNegative() {
		assertEquals(12, HelloWorld.BlackJack(12, -9));
	}
	@Test
	public void testOneAbove21() {
		assertEquals(2, HelloWorld.BlackJack(2, 24));
	}
	@Test
	public void testAbove21() {
		assertEquals(4, HelloWorld.BlackJack(22, 4));
	}
	@Test
	public void test1() {
		assertEquals(2, HelloWorld.BlackJack(1, 2));
	}
	

}


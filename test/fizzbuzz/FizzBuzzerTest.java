package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	private FizzBuzzer fb;

	@BeforeEach
	void setUp() {
		fb = new FizzBuzzer();
	}

	@Test
	void testDebutDePartie() {
		assertEquals("1", fb.play());
		assertEquals("2", fb.play());
	}

	@Test
	void testPremierFizz() {
		preshot(2);
		assertEquals("Fizz", fb.play());
	}

	@Test
	void testPremierBuzz() {
		preshot(4);
		assertEquals("Buzz", fb.play());
	}

	@Test
	void testMilieuPartie() {
		preshot(5);
		assertEquals("Fizz", fb.play());
		assertEquals("7", fb.play());
		assertEquals("8", fb.play());
		assertEquals("Fizz", fb.play());
		assertEquals("Buzz", fb.play());
	}

	@Test
	void testFizzBuzz() {
		preshot(14);
		assertEquals("FizzBuzz", fb.play());
	}

	@Test
	void testDebutPartie() {
		preshot(3);
		assertEquals("4", fb.play());
	}

	@Test
	void testPartieComplete() {
		String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz";
		String actual = preshot(36);
		assertEquals(expected, actual);
	}

	private String preshot(int nbTours) {
		StringBuilder sb = new StringBuilder(fb.play());
		for (int i = 0; i < nbTours - 1; i++) {
			sb.append(", ");
			sb.append(fb.play());
		}
		return sb.toString();
	}

}

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

	private void preshot(int nbTours) {
		for (int i = 0; i < nbTours; i++) {
			fb.play();
		}
	}

}

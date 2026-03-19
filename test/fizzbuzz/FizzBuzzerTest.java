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

	private void preshot(int nbTours) {
		for (int i = 0; i < nbTours; i++) {
			fb.play();
		}
	}

}

package fizzbuzz;

public class FizzBuzzer {

	private static int MAGIC_KEYS[] = { 3, 5 };
	private static String MAGIC_VALUES[] = { "Fizz", "Buzz" };

	private int turn = 1;

	public String play() {
		String answer = turnToAnswer();
		turn++;
		return answer;
	}

	private String turnToAnswer() {
		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (turn % MAGIC_KEYS[i] == 0) {
				return MAGIC_VALUES[i];
			}
		}
		return "%d".formatted(turn);
	}

}

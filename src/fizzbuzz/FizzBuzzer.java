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
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (turn % MAGIC_KEYS[i] == 0) {
				sb.append(MAGIC_VALUES[i]);
			}
		}
		return sb.isEmpty() ? "%d".formatted(turn) : sb.toString();
	}

}

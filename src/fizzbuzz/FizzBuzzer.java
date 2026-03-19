package fizzbuzz;

public class FizzBuzzer {

	private static int MAGIC_KEY = 3;
	private static String MAGIC_VALUE = "Fizz";

	private int turn = 1;

	public String play() {
		if (turn == MAGIC_KEY) {
			return MAGIC_VALUE;
		}

		String answer = "%d".formatted(turn);
		turn++;
		return answer;
	}

}

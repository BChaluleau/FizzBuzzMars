package fizzbuzz;

public class FizzBuzzer {

	private int turn = 1;

	public String play() {
		String answer = "%d".formatted(turn);
		turn++;
		return answer;
	}

}

import java.util.Scanner;

public class Number_game {

	// Function that implements the
	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int)(100
							* Math.random());

		// Given K trials
		int K = 3;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 3 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " Your guess is correct");
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "too High " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " too Low " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted"
				+ " K trials.");

			System.out.println(
				"The number was " + number);
		}
	}

	public static void main(String arg[])
	{

		guessingNumberGame();
	}
}

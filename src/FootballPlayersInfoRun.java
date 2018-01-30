import java.util.InputMismatchException;
import java.util.Scanner;

public class FootballPlayersInfoRun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean done = false;

		try {
			System.out.println(
					"Welcome to the NFL player info database.\nWhat player would you like to learn more about?(enter a number 1-10):");
			int refNum = scan.nextInt() - 1;
			

				System.out.printf("Player %d is %s.\nWhat would you like to know about %s?\n", refNum + 1,
						FPlayersInfo.playerName[refNum], FPlayersInfo.playerName[refNum]);
			do {
				String topic = FPlayersInfo.getString(scan,
						"Enter: \"Team\", \"Position\", \"College\", \"Number\" or \"Experience\"?\n");
				FPlayersInfo.infoDisplayer(topic, refNum);
				
			} while (!done);

		} catch (InputMismatchException e) {
			System.out.println("Sorry, Please enter a number(1-10)");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry, Please enter a number(1-10)");
	}

	}
}

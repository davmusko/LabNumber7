import java.util.InputMismatchException;
import java.util.Scanner;

public class FootballPlayersInfoRun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean done = false;
		boolean exiter = false;
		do {
			try { //Prompts the user to enter an index number to select a player
				System.out.println("Welcome to the NFL player info database.\nWhat player would you like to learn more about?(enter a number 1-10):");
				int refNum = scan.nextInt() - 1;
				done = true;
				
				while(!exiter) {
				//Prompts the user to select a topic to learn more about
				System.out.printf("Player %d is %s.\nWhat would you like to know about %s?\n", refNum + 1,
						FPlayersInfo.playerName[refNum], FPlayersInfo.playerName[refNum]);
				String topic = FPlayersInfo.getString(scan,"Enter: \"Team\", \"Position\", \"College\", \"Number\", or \"Experience\"?\n");
				FPlayersInfo.infoDisplayer(topic, refNum);
				System.out.println("Type \"exit\" or \"rerun\"");
				String s = scan.nextLine();
				if(s.equalsIgnoreCase("exit")) {
					exiter = true;
					System.out.println("Thank you! Goodbye!");
				}
				}

			} catch (InputMismatchException e) {
				System.out.println("Sorry, Please enter a number(1-10)");
				scan.next();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Sorry, Please enter a number(1-10)");
			}

			}while (!done);
	}
}

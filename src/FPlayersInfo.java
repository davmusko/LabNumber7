import java.util.Scanner;

public class FPlayersInfo {
	static String[] playerName = {"Tom Brady","Le'Veon Bell","Matthew Stafford","Todd Gurley","Marshon Lattimore","Jordy Nelson","J.J. Watt","Jalen Ramsey","Zach Ertz","Justin Tucker"};
	static String[] playerTeam = {"New England Patriots","Pittsburgh Steelers","Detroit Lions","Los Angeles Rams","New Orleans Saints","Green Bay Packers","Houston Texans","Jacksonville Jaguars","Philadelphia Eagles","Baltimore Ravens"};
	static String[] playerCollege = {"Michigan","Michigan State","Georgia","Georgia","Ohio State","Kansas State","Wisconsin","Florida State","Stanford","Texas"};
	static String[] playerPos = {"Quarterback","Running Back","Running Back","Running Back","Corner Back","Wide Receiver","Defensive End","Corner Back","Tight End","Placekicker"};
	static int [] playerNumber = {12,26,9,30,23,87,99,20,86,9};
	static int [] playerYear = {18,5,9,3,1,10,7,2,5,6};
	
	public static void infoDisplayer(String topic, int i) {
		topic = topic.toUpperCase();
		switch(topic) {
		case "TEAM":
			System.out.println(playerName[i] + " plays for The " + teamGetter(i));
			break;
			
		case "POSITION":
			System.out.println(playerName[i] + " is a " + positionGetter(i));
			break;
			
		case "COLLEGE":
			System.out.println(playerName[i] + " played at " + collegeGetter(i));
			break;
			
		case "NUMBER":
			System.out.println(playerName[i] + " wears number " + numberGetter(i));
			break;
			
		case "EXPERIENCE":
			System.out.println(playerName[i] + " has " + yearGetter(i) + " year(s) of experience in the NFL");
			break;
			
		}
	}
	
	
	public static String nameGetter(int i) {
		return playerName[i];
	}

	public static String teamGetter(int i) {
		return playerTeam[i];
	}

	public static String collegeGetter(int i) {
		return playerCollege[i];
	}

	public static String positionGetter(int i) {
		return playerPos[i];
	}

	public static int numberGetter(int i) {
		return playerNumber[i];
	}

	public static int yearGetter(int i) {
		return playerYear[i];
	}

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
}

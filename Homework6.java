package homeworkChapter14;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter your sentence:");
		String Sentence = scanner.nextLine();
		String[] tokens = Sentence.split("/|\\.|,");

		String month = monthString(Integer.valueOf(tokens[0]));

		if (month != null)
			System.out.printf("%s %s, %s", month, tokens[1], tokens[2]);

		scanner.close();
	}

	public static String monthString(int monthNum) {

		String monthString = null;
		switch (monthNum) {
		case 1:
			monthString = "January";
			break;

		case 2:
			monthString = "February";
			break;

		case 3:
			monthString = "March";
			break;

		case 4:
			monthString = "April";
			break;

		case 5:
			monthString = "May";
			break;

		case 6:
			monthString = "June";
			break;

		case 7:
			monthString = "July";
			break;

		case 8:
			monthString = "August";
			break;

		case 9:
			monthString = "September";
			break;

		case 10:
			monthString = "October";
			break;

		case 11:
			monthString = "November";
			break;

		case 12:
			monthString = "December";
			break;

		default:
			System.out.println("You enter wrong message");
		}
		return monthString;
	}
}

//14.19 (Printing Dates in Various Formats) Dates are printed in several common formats.
//Two of the more common formats are
//04/25/1955 and April 25, 1955
//Write an application that reads a date in the first format and prints it in the second format.
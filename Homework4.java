package homeworkChapter14;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter your sentence:");
		String sentence = scanner.nextLine().toLowerCase();
		System.out.println("and now enter the character we will count:");
		char ch = scanner.nextLine().charAt(0);
		System.out.println(counter(sentence, ch));
		scanner.close();
	}

	public static int counter(String sentence, char ch) {

		int count = 0;
		int from = sentence.indexOf(ch);

		while (from >= 0) {
			count++;
			from = sentence.indexOf(ch, from + 1);
		}
		return count;
	}
}

//14.11 (Searching Strings) Write an application that inputs a line of text and a search character and
//uses String method indexOf to determine the number of occurrences of the character in the text.
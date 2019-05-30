package homeworkChapter14;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter your sentence:");
		String Sentence = scanner.nextLine();

		String[] tokens = Sentence.split(" ");
		System.out.printf("Number of elements: %d\nThe tokens are:\n", tokens.length);

		for (String token : tokens) {

			StringBuilder buff = new StringBuilder(token.toLowerCase());
			buff.reverse();
			System.out.print(buff + " ");
		}
		scanner.close();
	}

}


//14.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
//text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
//characters as delimiters
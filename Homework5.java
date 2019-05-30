package homeworkChapter14;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter your sentence:");
		String Sentence = scanner.nextLine().toLowerCase();

		String[] tokens = Sentence.split(" ");
		System.out.printf("Number of elements: %d\nThe tokens are:\n", tokens.length);

		for (String token : tokens) {
			if (token.endsWith("ed"))
				System.out.print(token + " ");
			else
				continue;
		}
		scanner.close();
	}

}

//14.14 (Tokenizing and Comparing Strings) Write an application that reads a line of text, 
//tokenizes it using space characters as delimiters and outputs only those words ending with the letters "ED".
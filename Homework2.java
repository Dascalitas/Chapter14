package homeworkChapter14;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter your sentence:");
		String enSentence = scanner.nextLine();

		String[] tokens = enSentence.split(" ");
		System.out.printf("Number of elements: %d\nThe tokens are:\n", tokens.length);

		for (String token : tokens) {

			System.out.print(transformTok(token.toLowerCase()) + " ");
		}
		scanner.close();
	}

	public static String transformTok(String token) {

		StringBuilder buff = new StringBuilder(token);
		char character = token.charAt(0);
		buff.deleteCharAt(0);
		buff.append(character);
		buff.append("ay");
		String latWord = buff.toString();

		return latWord;
	}
}

//14.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
//Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
//simplicity, use the following algorithm:
//To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
//with String method split. To translate each English word into a pig Latin word, place the first
//letter of the English word at the end of the word and add the letters �ay.� Thus, the word �jump�
//becomes �umpjay,� the word �the� becomes �hetay,� and the word �computer� becomes �omputercay.�
//Blanks between words remain as blanks. Assume the following: The English phrase consists of
//words separated by blanks, there are no punctuation marks and all words have two or more letters.
//Method printLatinWord should display each word. Each token is passed to method printLatinWord to 
//print the pig Latin word. Enable the user to input the sentence. Keep a running display of
//all the converted sentences in a text area.
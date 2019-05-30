package homeworkChapter14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<Character, String> Morze = new HashMap<Character, String>();
		Morze.put('A', ".-");
		Morze.put('B', "-...");
		Morze.put('C', "-.-.");
		Morze.put('D', "-..");
		Morze.put('E', ".");
		Morze.put('F', "..-.");
		Morze.put('G', "--.");
		Morze.put('H', "....");
		Morze.put('I', "..");
		Morze.put('J', ".---");
		Morze.put('K', "-.-");
		Morze.put('L', ".-..");
		Morze.put('M', "--");
		Morze.put('N', "-.");
		Morze.put('O', "---");
		Morze.put('P', ".--.");
		Morze.put('Q', "--.-");
		Morze.put('R', ".-.");
		Morze.put('S', "...");
		Morze.put('T', "-");
		Morze.put('U', "..-");
		Morze.put('V', "...-");
		Morze.put('W', ".--");
		Morze.put('X', "-..-");
		Morze.put('Y', "-.--");
		Morze.put('Z', "--..");
		Morze.put('1', (".----"));
		Morze.put('2', ("..---"));
		Morze.put('3', ("...--"));
		Morze.put('4', ("....-"));
		Morze.put('5', ("......"));
		Morze.put('6', ("-...."));
		Morze.put('7', ("--..."));
		Morze.put('8', ("---.."));
		Morze.put('9', ("----."));
		Morze.put('0', ("-----"));

		System.out.println("Please, enter your sentence:");
		String Sentence = scanner.nextLine().toUpperCase();

		String[] tokens = Sentence.split(" ");

		for (String token : tokens) {
			char[] characters = token.toCharArray();
			for (char character : characters) {

				System.out.print(Morze.get(character) + " ");
			}
			System.out.print("| ");
		}
	}
}

//14.22 (Morse Code) Perhaps the most famous of all coding schemes is the Morse code, developed
//by Samuel Morse in 1832 for use with the telegraph system. The Morse code assigns a series of dots
//and dashes to each letter of the alphabet, each digit, and a few special characters (e.g., period,
//comma, colon, semicolon). In sound-oriented systems, the dot represents a short sound and the dash a
//long sound. Other representations of dots and dashes are used with light-oriented systems and signal-flag systems.
//Separation between words is indicated by a space or, simply, the absence of a dot or dash. In a sound-oriented system,
//a space is indicated by a short time during which no sound is transmitted. The international version of the Morse code 
//appears in Fig. 14.26.
//Write an application that reads an English-language phrase and encodes it into Morse code.
//Also write an application that reads a phrase in Morse code and converts it into the English-language equivalent.
//Use one blank between each Morse-coded letter and three blanks between each Morse-coded word.
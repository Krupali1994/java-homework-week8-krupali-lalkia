package homeworkweek8;

import java.util.Scanner;

/**
 * Programme-3
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3 {

    //Main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Alphabet: ");
        String input = scanner.next();

        //Nested id else
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input is not a single letter.");
        } else {
            char c = Character.toLowerCase(input.charAt(0));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Input letter is Vowel.");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
        //Closing scanner
        scanner.close();
    }
}

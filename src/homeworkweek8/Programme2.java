package homeworkweek8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Programme2 {

    //instance method
    public static void minMax() {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, min, max;
        System.out.println("Enter first number: ");
        n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        n2 = scanner.nextInt();
        min = Math.min(n1, n2);
        max = Math.max(n1, n2);

        //while loop
        while (n2 != 0) {
            System.out.println("Enter a number or 0 to stop: ");
            n2 = scanner.nextInt();
            if (n2 != 0) {
                min = Math.min(min, n2);
                max = Math.max(max, n2);
            }
        }
        //printing statements
        System.out.println("Smallest number is: " + min);
        System.out.println("Largest number is: " + max);

        //Closing scanner
        scanner.close();
    }

    //Main method
    public static void main(String[] args) {
        minMax();
    }
}

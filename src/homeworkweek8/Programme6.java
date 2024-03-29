package homeworkweek8;

import java.util.Scanner;

/**
 * Programme-6
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme6 {
    //Main method
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int numberRows = scanner.nextInt();

        //for loop
        for (int i = 1; i <= numberRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //scanner closing
        scanner.close();
    }
}

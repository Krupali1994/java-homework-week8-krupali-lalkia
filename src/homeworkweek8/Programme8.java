package homeworkweek8;

import java.util.Scanner;

/**
 * Programme-8
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme8 {

    //Main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        //if else condition
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            //for loop
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer");
        }

        //scanner closing
        scanner.close();
    }
}

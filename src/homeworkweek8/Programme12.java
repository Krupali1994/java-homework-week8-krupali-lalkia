package homeworkweek8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */
public class Programme12 {
    //static method
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        //for loop
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        //Scanner close
        scanner.close();

        //nested if else condition
        if (isPrimeNumber(a)) {
            System.out.println(a + " is a Prime number");
        } else if (a <= 1) {
            System.out.println("Invalid input, please enter the positive number greater than 1 ");
        } else {
            System.out.println(a + " is not a Prime number");
        }
    }
}

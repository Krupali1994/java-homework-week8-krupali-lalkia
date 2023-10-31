package homeworkweek8;

import java.util.Scanner;

/**
 * 11.	Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE:The method getEvenDigitSum should be defined as public static
 */
public class Programme11 {

    //static method
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }
        int lastDigit = 0;
        int evenDigitSum = 0;

        //while loop
        while (num != 0) {
            lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            num = num / 10;
        }
        return evenDigitSum;
    }

    //Main method
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        int result = getEvenDigitSum(a);
        System.out.println("Sum of even digit in 12 is: " + result);
        //closing scanner
        scanner.close();
    }
}

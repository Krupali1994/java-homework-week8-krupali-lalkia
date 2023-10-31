package homeworkweek8;

import java.util.Scanner;

/**
 * 10.Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10 {

    //static method
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        //while loop
        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }
        return originalNumber == result;
    }

    //Main method
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        //if else condition
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is a Armstrong Number");
        } else {
            System.out.println(number + " is not a Armstrong Number");
        }

        //Scanner closing
        scanner.close();
    }
}

package homeworkweek8;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9 {

    //instance method
    public void isFibonacciNumber() {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Fibonacci number: ");
        int fibonacciNumber = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);

        //for loop
        for (int i = 2; i < fibonacciNumber; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        //scanner close
        scanner.close();
    }

    //Main method
    public static void main(String[] args) {
        //Object creation
        Programme9 obj = new Programme9();
        obj.isFibonacciNumber();
    }
}

// Write a java Program to add two numbers.

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, sum;
        System.out.println("Enter First Number");
        a = scanner.nextInt();
        System.out.println("Enter Second Number");
        b = scanner.nextInt();

        sum = a + b;

        System.out.println("Sum of A + B = " + sum);

        scanner.close();
    }
}

// Write a java program to check if a number is even or odd.

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        int n = 1;

        Scanner sc = new Scanner(System.in);

        while (n == 1) {
            System.out.println("Enter a number to check whether it is even or odd: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Do you want to continue Press 1: ");
            n = sc.nextInt();
        }

        sc.close();

    }
}

// Write a java Program to find the factorial of a number 

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=1,fact;
        while (n == 1) {
            System.out.println("Enter to find the factorial of a number");
            int number = sc.nextInt();
            fact=1;
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of the number is " + fact);

            System.out.println("Do you want to continue Press 1");
            n = sc.nextInt();

        }
        sc.close();
    }
}

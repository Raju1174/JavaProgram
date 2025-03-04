// Write a java Program to check if a given year is a leap year 

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=1;
        while (n == 1) {
            System.out.println("Enter Year");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }

            System.out.println("Do you want to continue Press 1");
            n = sc.nextInt();

        }

        sc.close();
    }
}

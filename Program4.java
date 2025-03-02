// Write a java Program to find the largest of three numbers 

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        int num1, num2, num3, n=1;

        Scanner sc = new Scanner(System.in);

        while (n == 1) {
            System.out.println("Enter three numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("First Number is Greatest");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("Second Number is Greatest");
            } else {
                System.out.println("Third Number is Greatest");
            }

            System.out.println("\nDo you want to continue: Press 1 ");
            n = sc.nextInt();

        }
        sc.close();

    }
}

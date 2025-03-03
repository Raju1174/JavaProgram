// Write a java program to generate Fibonacci series up to n terms

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {

        int a = 0, b = 1, number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate fibonacci series");
        number = sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < number; i++) {

            sum = a + b;

            System.out.println(sum);

            a = b;
            b = sum;

        }

        sc.close();

    }
}

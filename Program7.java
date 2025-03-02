// Write a java program to reverse a number 

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        
        int number,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to reverse a number");
        number = sc.nextInt();
        
        while(number > 0){
            temp = number % 10;
            sum = sum * 10 + temp;
            number = number/10;

        }

        System.out.println("Reversed Number: "+sum);

        sc.close();

    }
}

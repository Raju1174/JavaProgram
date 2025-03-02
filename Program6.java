// Write a java Program to calculate the sum of digits of a number 

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        
        long number,rem,sum=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and calculate the sum of digits of a number= ");
        number = sc.nextLong();

        while(number>0){
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }

        System.out.println("Total sum of number = "+ sum);


        sc.close();


    }    
}

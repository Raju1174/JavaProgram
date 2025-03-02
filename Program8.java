// Write a Java Program to check if a number is a palindrome or not 

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {

        int originalNumber,calculatedNumber=0,number,temp;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        originalNumber = number;
        calculatedNumber =0;


        while(number >0){
            temp = number % 10;
            calculatedNumber = calculatedNumber * 10 + temp;
            number /= 10;

            
        }


        if(originalNumber == calculatedNumber){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
    
}

// Write a java program to swap two numbers without using a third variable 

public class Program5 {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swapping the value of a = "+a+" & b = "+b);

        a = a + b;
        b= a - b;
        a = a - b;


        System.out.println("After Swapping the value of a = "+a+" & b = "+b);
        



    }    
}

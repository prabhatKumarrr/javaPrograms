//Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class Main {
    public static void factorial(int n) {
        if(n<0) {
            System.out.println("Negative Number");
            return;
        }

        int fact=1;

        for(int i=1;i<=n;i++) {
            fact*=i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = input.nextInt();

        factorial(n);
    }
}

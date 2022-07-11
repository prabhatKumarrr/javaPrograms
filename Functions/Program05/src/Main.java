//Write a program to print the product of two numbers entered by user by defining your own method

import java.util.Scanner;

public class Main {
    public static int product(int a ,int b) {
        return a*b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = in.nextInt();
        System.out.print("Enter Second Number:");
        int b = in.nextInt();

        System.out.println("The product of "+a+" & "+b+" is "+product(a ,b));
    }
}

//Write a program to print the sum of two numbers entered by user by defining your own method

import java.util.Scanner;

public class Main {
    public static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = in.nextInt();
        System.out.print("Enter Second Number:");
        int b = in.nextInt();

        System.out.println("The sum of "+a+" & "+b+" is "+(a+b));
    }

    public static void main(String[] args) {

        sum();
    }
}

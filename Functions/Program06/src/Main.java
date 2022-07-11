//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;



public class Main {
    public static void print() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius:");
        int r = input.nextInt();

        System.out.println("Circumference of Circle = "+(2*3.14*r));
        System.out.println("Area of Circle = "+(3.14*r*r));

    }

    public static void main(String[] args) {
        print();
    }
}

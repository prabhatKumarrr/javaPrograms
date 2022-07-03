//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a = input.nextInt();

        System.out.print("Enter the second number:");
        int b = input.nextInt();

        if(a>b) {
            System.out.println("Greater number is " + a);
        }
        else {
            System.out.println("Greater number is " + b);
        }
    }
}
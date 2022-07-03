//Program to input Principal,Time & Rate of Interest and output Simple Interest.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount:");
        int principal = input.nextInt();

        System.out.print("Enter the Rate of Interest:");
        int rate = input.nextInt();

        System.out.print("Enter the Period of Time:");
        int time = input.nextInt();

        System.out.println("The Simple Interest for the provided input is " + (principal*rate*time));
    }
}
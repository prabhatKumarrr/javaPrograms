// A program to find whether the entered number is even or odd
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = input.nextInt();

        if(n>=0) {
            if(n%2==0) {
                System.out.println("It's an Even Number.");
            }
            else {
                System.out.println("It's an Odd Number.");
            }
        }
        else {
            System.out.println("Negative Integer");
        }

    }
}
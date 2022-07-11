//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;



public class Main {

    static String even_odd(int n) {
        if(n%2==0) {
            return "Even";
        }
        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number:");
        int n = input.nextInt();

        System.out.println("The Number is "+even_odd(n));
    }
}

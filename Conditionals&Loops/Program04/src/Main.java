//Take integer inputs till the user enters 0 and print the sum of all numbers(Hint:While Loop)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Integer:");
        int n = input.nextInt();
        int sum = 0;

        while(n!=0) {
            sum+=n;
            System.out.print("Enter next Integer:");
            n = input.nextInt();
        }

        System.out.println("The sum of all Integers entered is " + sum);


    }
}

//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int n = input.nextInt();
        int max = 0;

        while(n!=0) {
            if(n>max) {
                max=n;
            }
            System.out.print("Enter next Integer:");
            n = input.nextInt();
        }

        System.out.println("The largest number is " + max);
    }
}

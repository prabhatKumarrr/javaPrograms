//Factorial Program In Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number:");

        int n = input.nextInt();
        int factorial=1;

        for(int i=1;i<=n;i++) {
            factorial*=i;
        }
        System.out.println("the Factorial of given number is " + factorial);
    }
}

//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Main {
    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the last Natural Number:");
        int n = input.nextInt();

        System.out.println("The sum of first "+n+" Natural Numbers is "+sum(n));
    }
}

//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }

        if(n<=0) {
            System.out.println("Number is less than 0");
            return false;
        }

        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number:");
        int n = input.nextInt();

        if(isPrime(n)){
            System.out.println("Prime Number");
        }
        else
            System.out.println("Not a Prime Number");
    }
}

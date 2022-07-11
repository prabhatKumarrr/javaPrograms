//Write a function that prints all prime numbers between two given numbers.


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void primeNumbers(int a, int b) {
        for(int i=a;i<=b;i++) {
            boolean p=true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    p=false;
                    break;
                }
            }
            if(p) {
                System.out.print(i+", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Starting Integer:");
        int a = input.nextInt();
        System.out.print("Enter the Ending Integer:");
        int b = input.nextInt();

        System.out.println("Prime Numbers between "+a+" & "+b+" are:\n");
        primeNumbers(a, b);


    }
}

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of
//numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfNegNums=0,sumOfPosEvenNums=0,sumOfPosOddNums=0;

        System.out.print("Enter the First Number:");
        int n = input.nextInt();

        while(n!=0) {
            if(n>0) {
                if(n%2==0) {
                    sumOfPosEvenNums+=n;
                }
                else {
                    sumOfPosOddNums+=n;
                }
            }
            else {
                sumOfNegNums+=n;
            }

            System.out.print("Enter The Next Number:");
            n = input.nextInt();
        }

        System.out.println("Sum of Negative Numbers = "+sumOfNegNums+"\nSum of Positive Even Numbers = "+sumOfPosEvenNums+"\nSum of Positive Odd Numbers = "+sumOfPosOddNums);
    }
}

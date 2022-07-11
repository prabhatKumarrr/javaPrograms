//Write a function to find if a number is a palindrome or not. Take number as parameter

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int n) {
        int temp = 0;

        for(int i=n;i>0;i/=10) {
            temp=temp*10+(i%10);
        }

        if(n==temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = input.nextInt();

        if(isPalindrome(n)){
            System.out.println("Its Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}

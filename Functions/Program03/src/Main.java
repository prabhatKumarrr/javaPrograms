//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Main {
    static boolean isEligible(int age) {
        if(age>=18) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age:");
        int age = input.nextInt();

        if(isEligible(age)) {
            System.out.println("You are Eligible to Vote.");
        }
        else {
            System.out.println("You are not Eligible Vote.");
        }
    }
}

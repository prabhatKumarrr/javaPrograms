//Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


import java.util.Scanner;

public class Main {
    public static boolean isPythagorean(int a, int b, int c) {
        int aa=a*a,bb=b*b,cc=c*c;

        if(aa+bb==cc) {
            return true;
        }
        else if(aa+cc==bb) {
            return true;
        }
        else if(bb+cc==aa) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = input.nextInt();

        System.out.print("Enter Second Number:");
        int b = input.nextInt();

        System.out.print("Enter Third Number:");
        int c = input.nextInt();

        if(isPythagorean(a, b, c)) {
            System.out.println("Pythagorean Triplet");
        }
        else
            System.out.println("Not a Pythagorean Triplet");
    }
}

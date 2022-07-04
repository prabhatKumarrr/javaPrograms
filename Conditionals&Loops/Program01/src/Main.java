//Total Surface Area of a cube

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of each side:");
        int a = input.nextInt();

        System.out.println("The area of Cube is " + 6*Math.pow(a,2));
    }
}

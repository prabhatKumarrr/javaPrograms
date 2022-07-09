//Check Leap Year or not
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year:");
        int year = input.nextInt();

        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("Not a Leap Year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("Not a Leap Year");
        }

    }
}

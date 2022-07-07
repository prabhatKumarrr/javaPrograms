//Sub=tract the sum of digits of a number from product of its digits
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number:");
        int n = input.nextInt();

        int product = 1, sum = 0;

        for(int i=n;i>0;i/=10) {
            product = product*(i%10);
            sum = sum+(i%10);
        }

        System.out.println("The Difference between Product and Sum of digits of " + n + " is " + (product-sum));
    }
}

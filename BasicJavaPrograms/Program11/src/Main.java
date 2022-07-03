//Find if the Entered Number is Palindrome or not.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number:");
        int n = input.nextInt();
        int ans = 0;

        for(int i=n;i>0;i/=10) {
            ans=ans*10+i%10;
        }

        if(ans==n) {
            System.out.println("It's Palindrome.");
        }
        else {
            System.out.println("Not Palindrome.");
        }
    }
}

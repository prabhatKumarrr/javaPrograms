//To find out whether the given String is Palindrome or not.
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = input.nextLine();
        String rev = "";

        for(int i=(str.length()-1);i>=0;i--) {
            char c = str.charAt(i);
            rev = rev.concat(String.valueOf(c));
        }
        System.out.println(rev);

        if(rev.equals(str)) {
            System.out.println("The given string is Palindrome.");
        }
        else {
            System.out.println("The given string isn't Palindrome.");
        }
    }
}
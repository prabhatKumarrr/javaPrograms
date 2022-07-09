//Reverse a string in java
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String:");

        String str = input.nextLine();

        String rev = "";

        for(int i=str.length()-1;i>=0;i--) {
            char c=str.charAt(i);

            rev = rev.concat(String.valueOf(c));
        }

        System.out.println(rev);
        
    }
}

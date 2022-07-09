//Vowel or Constant
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Character:");
        char ch = input.next().trim().charAt(0);
        boolean isAlphabet=false;

        for(int i = 65;i<=122;i++) {
            if(i==90) {
                i=96;
            }

            if((char)i == ch) {
                isAlphabet = true;
                break;
            }
        }

        if(isAlphabet) {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                System.out.println("It's a Vowel");
            }
            else {
                System.out.println("It's a Constant");
            }
        }
        else {
            System.out.println("Entered character is not an alphabet.");
        }


    }
}

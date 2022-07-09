//Find HCF of two Numbers
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a = input.nextInt();
        System.out.print("Enter the second number:");
        int b = input.nextInt();

        int hcf = 0;

        if(!(a>b)) {
            int c = a;
            a=b;
            b=c;
        }

        while(a%b!=0){
            int c=a;
            a = b;
            b = c % b;
            hcf = b;
        }

        System.out.println("The HCF is "+hcf);
    }
}

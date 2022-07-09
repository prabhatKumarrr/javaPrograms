//Find Ncr & Npr(Hint: Npr = n!/(n-r)!  &&  Ncr = n!/r!(n-r)!)
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the value of n:");
        long n = input.nextLong();

        System.out.print("Enter the value of r:");
        long r = input.nextLong();

        long a=1,bP=1,C=1;


        for(int i=1;i<=n;i++) {
            a*=i;
        }

        for(int i=1;i<=(n-r);i++) {
            bP*=i;
        }

        for(int i=1;i<=r;i++) {
            C*=i;
        }

        System.out.println("Npr = "+(a/bP)+"\nNcr = "+(a/(C*bP)));
    }
}

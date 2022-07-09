//Perfect Number
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number:");
        int n = input.nextInt();
        int pN=0;

        for(int i=1;i<n;i++) {
            if(n%i==0) {
                pN+=i;
            }
        }

        if(n==pN) {
            System.out.println("Perfect Number.");
        }
        else {
            System.out.println("Not a Perfect Number.");
        }
    }
}

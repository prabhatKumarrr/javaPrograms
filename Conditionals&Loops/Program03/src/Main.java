//Print Factors of a number
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = input.nextInt();

        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                System.out.print(i + ", ");
            }
        }
    }
}

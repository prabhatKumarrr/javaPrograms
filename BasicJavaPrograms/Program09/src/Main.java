//To find Armstrong Number between two given number.
//(ex- 153 = 1^3 + 5^3 + 3^3)
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number:");

        int n = input.nextInt();
        int arm=0;
        for(int i=n;i>0;i/=10) {

            arm+=Math.pow((i%10),3);

        }

        if(arm==n) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }

    }
}
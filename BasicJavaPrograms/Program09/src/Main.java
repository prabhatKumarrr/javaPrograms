//To find Armstrong Number between two given number.
//(ex- 153 = 1^3 + 5^3 + 3^3)
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two Numbers:");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int arm1=0,arm2=0;
        for(int i=n1;i>0;i/=10) {

            arm1+=Math.pow((i%10),3);

        }

        for(int i=n2;i>0;i/=10) {

            arm2+=Math.pow((i%10),3);

        }

        if(arm1==n1) {
            System.out.println(n1 + " is Armstrong");
        }
        else if(arm2==n2) {
            System.out.println(n2 + " is Armstrong");
        }
        else {
            System.out.println("None  of the is Armstrong");
        }

    }
}
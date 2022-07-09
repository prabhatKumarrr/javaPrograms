//Find LCM of two numbers
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number:");
        int a = input.nextInt();

        System.out.print("Enter the Second Number:");
        int b = input.nextInt();

        int hcf = 0,tempA=a,tempB=b;

        if(!(tempA>tempB)) {
            int temp= tempA;
            tempA=tempB;
            tempB=temp;
        }

        while(tempA%tempB!=0) {
            int temp = tempA;
            tempA=tempB;
            tempB=temp%tempB;

            hcf = tempB;
        }

        System.out.println("The LCM of "+a+" and "+b+" is "+(a*b)/hcf);
    }
}

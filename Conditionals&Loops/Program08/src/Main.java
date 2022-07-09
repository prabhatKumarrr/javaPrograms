//Compound Interest(Hint: CI=A-P --> A=P*(1+r/100)^n)
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal Amount:");
        double P = input.nextDouble();

        System.out.print("Enter the rate of interest:");
        double r = input.nextDouble();

        System.out.print("Enter no. of years:");
        int n = input.nextInt();

        double CI = (P*Math.pow((1+r/100),n))-P;

        System.out.println("The Compound interest on Rs "+P+" at a Rate of Interest "+r+"% for a period of "+n+" years is Rs "+CI);
    }
}

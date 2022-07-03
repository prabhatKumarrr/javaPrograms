//Input currency in rupees and output in USD.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Amount in Ruppees:");
        double amount = input.nextInt();

        System.out.println("The amount is USD is $" + amount/70);
    }
}
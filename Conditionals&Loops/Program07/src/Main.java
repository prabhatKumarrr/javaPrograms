//Calculate Depreciation of an asset(Hint: V2 = V1[1-r/100]^t)
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value of asset:");
        double V1 = input.nextDouble();

        System.out.print("Enter the rate of depreciation:");
        double r = input.nextDouble();

        System.out.print("Enter the life of asset:");
        double t = input.nextDouble();

        System.out.println("The Depreciation Value of asset is "+V1*Math.pow((1-(r/100)),t));


    }
}

//Build a working Calculator Program
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("********************************************* Calculator Program ***********************************************************");
        System.out.println("\n");

       System.out.println("Choose from below Operations:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modular Division\n6.Exit\n");
        System.out.print("Enter Your Choice(1-5):");
        int choice = input.nextInt();

        while(choice!=6) {

            System.out.println("Enter the two Numbers:");
            int a = input.nextInt();
            int b = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println(a+b);
                    break;

                case 2:
                    System.out.println(a-b);
                    break;

                case 3:
                    System.out.println(a*b);
                    break;

                case 4:
                    if(b!=0) {
                        System.out.println(a/b);
                        break;
                    }
                    else {
                        System.out.println("Cant be divided by zero.");
                        break;
                    }

                case 5:
                    if(b!=0) {
                        System.out.println(a%b);
                        break;
                    }
                    else {
                        System.out.println("Cant be divided by zero.");
                        break;
                    }

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.print("Enter your choice for another operation or enter 6 to exit:");
            choice = input.nextInt();
        }

        if(choice==6) {
            System.out.println("Exiting.............");
        }
    }
}

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.print("Enter the first Number:");
        int num1 = input.nextInt();

        System.out.print("Enter the second number:");
        int num2 = input.nextInt();

        System.out.print("Enter the operator(+,-,*,/):");
        char op = input.next().trim().charAt(0);

        if(op=='+') {
            System.out.println(num1+num2);
        }
        else if(op=='-') {
            System.out.println(num1-num2);
        }
        else if(op=='*') {
            System.out.println(num1*num2);
        }
        else if(op=='/') {
            if(num2!=0) {
                System.out.println(num1/num2);
            }
            else {
                System.out.println("Dividend can't be zero");
            }
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
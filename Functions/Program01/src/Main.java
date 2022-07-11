//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;




public class Main {

    public static void Max(int a, int b, int c) {
        int max = a;
        if(b>max) {
            max=b;
        }
        if(max<c) {
            max=c;
        }

        System.out.println("The Maximum Number is "+max);
    }

    public static void Min(int a ,int b ,int c) {
        int min = a;
        if(min>b) {
            min=b;
        }
        if(min>c) {
            min=c;
        }

        System.out.println("The Minimum Number is "+min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a= input.nextInt();

        System.out.print("Enter Second Number:");
        int b= input.nextInt();

        System.out.print("Enter Third Number:");
        int c= input.nextInt();

        Max(a, b, c);
        Min(a, b, c);
    }
}

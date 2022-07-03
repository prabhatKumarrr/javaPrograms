//To calculate Fibonacci Series up to n numbers.
//(0,1,1,2,3,5,8,13,..............)
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of series:");
        int n = input.nextInt();
        int sum=0;

        for(int a=1,b=0,c=0,i=0;i<n;i++) {
            c=a+b;
            a=b;
            b=c;
            sum+=c;
            System.out.println(c);
        }

        System.out.println("The sum of series upto " + n + " is " + sum);
    }
}
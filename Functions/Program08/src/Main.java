//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

import java.util.Scanner;


public class Main  {

    public static void grade(int n) {
        if (n>=0 && n<=40) {
            System.out.println("Fail");
        }
        else if (n>=41 && n<=50) {
            System.out.println("DD");
        }
        else if (n>=51 && n<=60) {
            System.out.println("CD");
        }
        else if(n>=61 && n<=70) {
            System.out.println("BC");
        }
        else if (n>=71 && n<=80) {
            System.out.println("BB");
        }
        else if (n>=81 && n<=90) {
            System.out.println("AB");
        }
        else if (n>=91 && n<=100) {
            System.out.println("AA");
        }
        else {
            System.out.println("Invalid Marks");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Marks:");
        int n = input.nextInt();

        grade(n);
    }
}

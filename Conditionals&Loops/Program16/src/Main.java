//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in
//the month of August.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfDays = 0;

        for(int i=1;i<=31;i++) {
            if(i%2==0) {
                numOfDays++;
            }
        }

        System.out.println("Number of Days Kunal can go out in August is "+numOfDays);
    }
}

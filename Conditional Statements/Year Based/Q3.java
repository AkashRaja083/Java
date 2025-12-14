/*
Q3.Java Program to check whether the first two digits and last two digits of a year are equal.
*/

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int firstTwo = year / 100;
        int lastTwo = year % 100;

        if (firstTwo == lastTwo) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        sc.close();
    }
}

/*
Q4.Java Program to check whether two given years have the same last digit.
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        if (y1 % 10 == y2 % 10) {
            System.out.println("Same Last Digit");
        } else {
            System.out.println("Different Last Digit");
        }
        sc.close();
    }
}

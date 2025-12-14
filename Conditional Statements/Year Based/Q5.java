/*
Q5.Write a Java Program to check whether a given year and month combination is valid and print the number of days in that month (consider leap years for February).
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid Input");
        } else {
            int days;

            switch (month) {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    days = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;

                default: // February
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
            }
            System.out.println(days + " days");
        }
        sc.close();
    }
}
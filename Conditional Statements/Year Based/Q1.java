/*
Q1. Java Program to check whether a year is a leap year or not
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }        
    sc.close();
    } 
}

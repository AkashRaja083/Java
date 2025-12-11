/*
Q18.Write a Java Program to print your date of birth in the format DD/MM/YYYY.
*/

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.printf("%02d/%02d/%04d", date, month, year);
        sc.close();
    }
}

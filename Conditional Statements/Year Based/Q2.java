/*
Q2.Java Program to check whether a given year is a century year or not.
*/

import java.util.Scanner;
class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 100 == 0) {
            System.out.println("Century Year");
        } else {
            System.out.println("Not a Century Year");
        }
        sc.close();
    }
}


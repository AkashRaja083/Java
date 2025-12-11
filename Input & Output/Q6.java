/*
Q6.Write a Java Program to print the given fractional number in 2 digit decimal format.
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.printf("%.2f", num);
        sc.close();
    }
}

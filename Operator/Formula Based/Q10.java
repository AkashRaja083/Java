/*
Q10.Write a Java Program to find Perimeter of a Triangle
Formula :
    Perimeter of a Triangle => P = a + b + c
*/

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = a + b + c;
        System.out.println("Perimeter: " + p);
        sc.close();
    }
}

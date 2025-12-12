/*
Q9.Write a Java Program to find Perimeter of a Rectangle
Formula :
    Perimeter of a Rectangle => P = 2 × (length + width)
*/

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double p = 2 * (l + w);
        System.out.println("Perimeter: " + p);sc.close();
    }
}

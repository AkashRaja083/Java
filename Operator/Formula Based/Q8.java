/*
Q8.Write a Java Program to find Perimeter of a Square
Formula:
    Perimeter of a Square => P = 4 × side
*/

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double p = 4 * side;
        System.out.println("Perimeter: " + p);
        sc.close();
    }
}

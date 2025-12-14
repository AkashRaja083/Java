/*
Q6. Write a Java Program to check whether four sides form a square or rectangle.
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            System.out.println("Invalid Input");
        }
        else if (a == b && b == c && c == d) {
            System.out.println("Square");
        }
        else if (a == c && b == d) {
            System.out.println("Rectangle");
        }
        else {
            System.out.println("Neither Square nor Rectangle");
        }
        sc.close();
    }
}

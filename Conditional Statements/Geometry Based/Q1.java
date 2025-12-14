/*
Q1. Java Program to check whether a triangle is equilateral, isosceles, or scalene
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle!");
        } else if (a==b && b==c) {
            System.out.println("The triangle is EQUILATERAL");
        } else if (a==b || b==c || a==c) {
            System.out.println("The triangle is ISOSCELES");
        } else {
            System.out.println("The triangle is SCALENE");
        }
        sc.close();
    }
}
/*
Q11.Write a Java Program to find Javaircumference of a Javaircle
Formula :
        Circumference of a Circle => C = 2 × π × r
*/

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double c = 2 * Math.PI * r;
        System.out.println("Circumference: " + c);
        sc.close();
    }
}

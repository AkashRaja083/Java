/*
Q14.Write a Java Program to find Surface Area and Volume of a Sphere
Formula :
    Surface area = 4πr²
    Volume = 4/3 πr³
*/

import java.util.Scanner;

public class Q14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 4 * Math.PI * r * r;
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
        sc.close();
    }
}

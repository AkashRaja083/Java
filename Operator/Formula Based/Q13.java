/*
Q13.Write a Java Program to find Surface Area and Volume of a cuboid

Formula :
    Surface area = 2(lb + bh + hl)
    Volume = l × b × h
*/

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double area = 2 * (l*b + b*h + h*l);
        double volume = l * b * h;
        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
        sc.close();
    }
}

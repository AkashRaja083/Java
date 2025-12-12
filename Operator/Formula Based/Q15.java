/*
Q15.Write a Java Program to find Surface Area and Volume of a Javaylinder
Formula :
    Surface area = 2πr(h + r)
    Volume = πr²h
*/

import java.util.Scanner;

public class Q15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double area = 2 * Math.PI * r * (h + r);
        double volume = Math.PI * r * r * h;
        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
        sc.close();
    }
}

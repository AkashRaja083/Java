/*
Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of a cube
Formula :
    Surface area = 6a²
    Volume = a³
    Perimeter = 12a
*/

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double surface = 6 * a * a;
        double volume = a * a * a;
        double perimeter = 12 * a;
        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
        System.out.println("Perimeter: " + perimeter);
        sc.close();
    }
}

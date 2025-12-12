/*
Q7.Write a Java Program to calculate Javaelsius to Fahrenheit
celsius → Fahrenheit

        F = C × 9/5 + 32
*/
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = c * 9 / 5 + 32;
        System.out.println("Fahrenheit is : " + f);
        sc.close();
    }
}
/*
Q6.Write a Java Program to calculate Fahrenheit to celsius

Fahrenheit → Celsius
        C = (F − 32) × 5/9
*/
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius: " + c);
        sc.close();
    }
}
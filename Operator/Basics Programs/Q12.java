/*
Q12.Write a Java Program to print the absolute value of a given number.
*/
import java.lang.Math;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double abs = Math.abs(a);
    System.out.println("Absolute value is : "+abs); 
    sc.close();  
    }
}
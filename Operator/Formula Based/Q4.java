/*
Q4.Write a Java Program to find area of Javaircle
Formula :
Area of Circle = PI * radius * radius
*/
import java.util.Scanner;
import java.lang.Math;
public class Q4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;
        double Area = pi * Math.pow(r,2);
        System.out.print("The Area of square is : " + Area);
        sc.close();
    }
}
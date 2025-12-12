/*
Q3.Write a Java Program to find area of Triangle
Formula
Area of triangle = (base *height)/2
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int base = sc.nextInt();
        double Area = 0.5 *(height * base);
        System.out.print("The Area of triangle is : " + Area);
        sc.close();
    }
}

/*
Q4. Java Program to check whether the sum of three angles forms a valid triangle.
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    if(a <= 0 || b<=0 || c<=0)
        System.out.println("Invalid");
    if(a+b+c == 180)
        System.out.println("Valid Triangle");
    else
        System.out.println("Invalid");
    sc.close();
    }
}
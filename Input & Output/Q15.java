/*
Q15.Write a Java Program to print two numbers in two lines.
*/

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + "\n" + b);
        sc.close();
    }    
}
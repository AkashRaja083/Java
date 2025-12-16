/*
Q1. Write a Java program to print the first digit of a given number.
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >= 9){
            num/=10;
        }
        System.out.println(num);
        sc.close();
    }
}
/*
Q2. Write a Java program to find whether the first digit of a given number is odd or even.
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >= 9){
            num/=10;
        }
        if(num %2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
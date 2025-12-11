/*
Q2.Write a Java Program to Print the given word.
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        System.out.println("Given Word is : "+ch);
        sc.close();
    }
}
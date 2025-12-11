/*
Q22.Write a Java Program to print your marks in 5 subjects each on a new line.
*/

import java.util.Scanner;
public class Q22s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        System.out.println("Marks in 5 subjects:");
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("Subject 5: " + sub5);
        sc.close();
    }
}
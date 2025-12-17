/*
Q24. Write a java program to print all numbers between 1 to N which are power of 2.
*/

import java.util.Scanner;
public class Q24 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        while (val <= n) {
            System.out.print(val + " ");
            val *= 2;
        }
        sc.close();
    }
}
